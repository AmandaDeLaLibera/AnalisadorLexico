package PascalGenerator;

import static  PascalGenerator.Token.*;
%%
%class Lexer
%type Token

L = [a-zA-Z_]
D = [0-9]
WHITE=[ \t\r]

%{
public String lexeme;
%}
%%
{WHITE} {/*Ignore*/}

/* Porgrama */
("program") {lexeme = yytext(); return SIM_PROGRAM;}

/* Declaração */
("var") {lexeme = yytext(); return DECLARACAO;}

/* Tipo */
("interger" | "real") {lexeme = yytext(); return TIPO;}

/* Comandos */
("begin" | "if" | "then" | "else" | "end") {lexeme = yytext(); return COMANDOS;}

/* Pular linha */
( "\n")     {lexeme = yytext(); return LINHA;}

/* Operador Aritimetico */
( "+" | "-" | "*" | "/" | "%")   {lexeme = yytext(); return OPERADOR_ARITIMETICO;}

 /* Operador Logico */
( "&&" | "||" | "!" | "&" | "|")   {lexeme = yytext(); return OPERADOR_LOGICO;}

/* Operador Relacional */
( ">" | "<" | "==" | "!=" | ">=" | "<=" | "<<" | ">>")   {lexeme = yytext(); return OP_RELACIONAL;}

/* Operador Atribuicao */
( "+=" | "-=" | "*=" | "/=" | "++" | "--" | "=" | "%=" | ":=" | ":")   {lexeme = yytext(); return OP_ATRIBUICAO;}

/* Operador Booleano */
(true | false)   {lexeme = yytext(); return OP_BOOLEANO;}

/* Separadores */
( "(" | ")" | "{" | "}" | "[" | "]" | ";" | "," | "." | "\"")   {lexeme = yytext(); return SEPARADOR;}

/* Caracteres Especiais */
/*( "\b" | "\t" | "\n" | "\f")   {lexeme = yytext(); return ESPECIAL;} */

/* Comentarios */
("$$"(.)*)      {lexeme = yytext(); return COMENTARIO;}

/* Marcador de inicio do algoritmo */
("inicio")      {lexeme = yytext(); return INICIO;}

/* Marcador de fim do algoritmo */
("fim")      {lexeme = yytext(); return FIM;}

/* Marcador de inicio do bloco */
("ini_bloco")      {lexeme = yytext(); return MARCADOR_INICIO;}

/* Marcador de fim do bloco */
("fim_bloco")      {lexeme = yytext(); return MARCADOR_FIM;}

/* Marcar biblioteca */
("&bilbicisco")      {lexeme = yytext(); return BIBLIOTECA;}

/* Identificar escrita na tela */
("escreva")      {lexeme = yytext(); return ESCREVA;}

/* Identificar leitura na tela */
("leia")      {lexeme = yytext(); return LEIA;}

{L}({L}|{D})*    {lexeme = yytext(); return ID;}
 ("(-"{D}+")") | {D}+   {lexeme = yytext(); return NUMERO;}

. {return ERROR;}


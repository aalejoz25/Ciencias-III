package Analizador;
import static Analizador.Tokens.*;
%%
%class Lexico
%type Tokens
L=[a-zA-Z_]+                   
D=[0-9]+         
espacio=[ ,\t,\r]+
%{
    public String lexemas;
%}
%%

/* Espacios en blanco */
{espacio} {/*Ignore*/}

(try)
(catch)

/* Comentarios */
( "//"(.)* ) {/*Ignore*/}

/* Salto de linea */
( "\n" ) {return Linea;}

/* Comillas */
( "\"" ) {lexemas=yytext(); return Comillas;}

/* Tipo de dato Double */
( double ) {lexemas=yytext(); return Double;}

/* Tipo de dato Float */
( float ) {lexemas=yytext(); return Float;}

/* Tipo de dato Long */
( long ) {lexemas=yytext(); return Long;}

/* Tipo de dato Char */
( char ) {lexemas=yytext(); return Char;}

/* Tipo de dato Byte */
( byte ) {lexemas=yytext(); return Byte;}

/* Tipo de dato Int */
( int ) {lexemas=yytext(); return Int;}

/* Tipo de dato Void */
( void ) {lexemas=yytext(); return Void;}

/* Tipo de dato String */
( string ) {lexemas=yytext(); return Cadena;}

/* Palabra reservada If */
( if ) {lexemas=yytext(); return If;}

/* Palabra reservada Else */
( else ) {lexemas=yytext(); return Else;}

/* Operador Igual */
( "=" ) {lexemas=yytext(); return Igual;}

/* Operador Suma */
( "+" ) {lexemas=yytext(); return Suma;}

/* Operador Resta */
( "-" ) {lexemas=yytext(); return Resta;}

/* Operador Multiplicacion */
( "*" ) {lexemas=yytext(); return Multiplicacion;}

/* Operador Division */
( "/" ) {lexemas=yytext(); return Division;}

/* Op_And */
( "&&" ) {lexemas=yytext(); return Op_And;}

/* Op_Or */
( "||" ) {lexemas=yytext(); return Op_Or;}

/* Op_Not */
( "!" ) {lexemas=yytext(); return Op_Not;}

/* Op_Nand */
( "&" ) {lexemas=yytext(); return Op_Nand;}

/* Op_And */
( "|" ) {lexemas=yytext(); return Op_Nor;}

/*Operadores Relacionales */
( ">" | "<" | "==" | "!=" | ">=" | "<=" | "<<" | ">>" ) {lexemas = yytext(); return Op_relacional;}

/* Operadores Atribucion */
( "+=" | "-="  | "*=" | "/=" | "%=" ) {lexemas = yytext(); return Op_atribucion;}

/* Operadores Incremento y decremento */
( "++" | "--" ) {lexemas = yytext(); return Op_incremento;}

/*Operadores Booleanos*/
(true | false)      {lexemas = yytext(); return Op_booleano;}

/* Parentesis de apertura */
( "(" ) {lexemas=yytext(); return Parentesis_a;}

/* Parentesis de cierre */
( ")" ) {lexemas=yytext(); return Parentesis_c;}

/* Llave de apertura */
( "{" ) {lexemas=yytext(); return Llave_a;}

/* Llave de cierre */
( "}" ) {lexemas=yytext(); return Llave_c;}

/* Corchete de apertura */
( "[" ) {lexemas = yytext(); return Corchete_a;}

/* Corchete de cierre */
( "]" ) {lexemas = yytext(); return Corchete_c;}

/* Marcador de inicio de algoritmo */
( "main" ) {lexemas=yytext(); return Main;}

/* Marcador de inicio de impresion en pantalla */
( "printf" ) {lexemas=yytext(); return Printf;}

/* Punto y coma */
( ";" ) {lexemas=yytext(); return P_coma;}

/* Coma */
( "," ) {lexemas=yytext(); return Coma;}

/* Punto */
( "." ) {lexemas=yytext(); return Punto;}

/* Identificador */
{L}({L}|{D})* {lexemas=yytext(); return Identificador;}

/* Numero */
("(-"{D}+")")|{D}+ {lexemas=yytext(); return Numero;}

/* Error de analisis */
 . {return ERROR;}


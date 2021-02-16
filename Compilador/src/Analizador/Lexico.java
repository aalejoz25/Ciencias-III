/* The following code was generated by JFlex 1.4.3 on 16/02/21, 4:12 p. m. */

package Analizador;
import static Analizador.Tokens.*;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 16/02/21, 4:12 p. m. from the specification file
 * <tt>../Compilador/src/Analizador/Lexico.flex</tt>
 */
class Lexico {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\3\1\13\2\0\1\3\22\0\1\34\1\44\1\14\1\33"+
    "\1\0\1\51\1\42\1\0\1\52\1\53\1\41\1\37\1\61\1\40"+
    "\1\62\1\12\12\2\1\0\1\60\1\50\1\36\1\47\2\0\32\1"+
    "\1\56\1\0\1\57\1\46\1\1\1\0\1\10\1\20\1\7\1\15"+
    "\1\22\1\23\1\25\1\11\1\26\2\1\1\21\1\31\1\24\1\16"+
    "\1\32\1\1\1\5\1\30\1\4\1\17\1\27\1\35\1\1\1\6"+
    "\1\1\1\54\1\43\1\55\1\45\uff81\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\3\2\1\5\1\6"+
    "\1\7\13\2\1\1\1\10\1\11\1\12\1\13\1\14"+
    "\1\15\1\16\1\17\1\20\1\21\1\22\1\1\1\23"+
    "\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33"+
    "\6\2\1\34\10\2\1\35\11\2\2\0\1\36\1\37"+
    "\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47"+
    "\1\50\1\51\1\52\1\53\1\0\7\2\1\54\10\2"+
    "\1\55\10\2\3\0\1\2\1\56\2\2\1\57\1\60"+
    "\1\61\3\2\1\62\1\63\1\64\2\2\1\65\5\2"+
    "\1\66\2\2\2\0\1\3\4\2\1\67\1\2\1\70"+
    "\1\71\3\2\1\72\2\2\1\73\2\0\1\2\1\74"+
    "\1\2\1\75\1\0\1\76\1\77\1\100\1\101\1\102"+
    "\2\0\2\2\1\0\1\103\1\0\1\2\1\104\1\0"+
    "\1\105\2\0\1\4\11\0\1\106";

  private static int [] zzUnpackAction() {
    int [] result = new int[192];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\63\0\146\0\231\0\314\0\377\0\u0132\0\u0165"+
    "\0\u0198\0\63\0\63\0\u01cb\0\u01fe\0\u0231\0\u0264\0\u0297"+
    "\0\u02ca\0\u02fd\0\u0330\0\u0363\0\u0396\0\u03c9\0\u03fc\0\u042f"+
    "\0\u0462\0\u0495\0\u04c8\0\u04fb\0\u052e\0\u0561\0\63\0\63"+
    "\0\u0594\0\u05c7\0\u05fa\0\u062d\0\63\0\63\0\63\0\63"+
    "\0\63\0\63\0\63\0\63\0\u0660\0\u0693\0\u06c6\0\u06f9"+
    "\0\u072c\0\u075f\0\63\0\u0792\0\u07c5\0\u07f8\0\u082b\0\u085e"+
    "\0\u0891\0\u08c4\0\u08f7\0\146\0\u092a\0\u095d\0\u0990\0\u09c3"+
    "\0\u09f6\0\u0a29\0\u0a5c\0\u0a8f\0\u0ac2\0\u0af5\0\u0b28\0\63"+
    "\0\63\0\63\0\63\0\63\0\63\0\63\0\63\0\63"+
    "\0\63\0\63\0\63\0\63\0\63\0\u0b5b\0\u0b8e\0\u0bc1"+
    "\0\u0bf4\0\u0c27\0\u0c5a\0\u0c8d\0\u0cc0\0\146\0\u0cf3\0\u0d26"+
    "\0\u0d59\0\u0d8c\0\u0dbf\0\u0df2\0\u0e25\0\u0e58\0\146\0\u0e8b"+
    "\0\u0ebe\0\u0ef1\0\u0f24\0\u0f57\0\u0f8a\0\u0fbd\0\u0ff0\0\u1023"+
    "\0\u1056\0\u1089\0\u10bc\0\146\0\u10ef\0\u1122\0\146\0\146"+
    "\0\146\0\u1155\0\u1188\0\u11bb\0\146\0\146\0\146\0\u11ee"+
    "\0\u1221\0\146\0\u1254\0\u1287\0\u12ba\0\u12ed\0\u1320\0\146"+
    "\0\u1353\0\u1386\0\u13b9\0\u13ec\0\63\0\u141f\0\u1452\0\u1485"+
    "\0\u14b8\0\146\0\u14eb\0\146\0\146\0\u151e\0\u1551\0\u1584"+
    "\0\146\0\u15b7\0\u15ea\0\146\0\u161d\0\u1650\0\u1683\0\146"+
    "\0\u16b6\0\146\0\u16e9\0\146\0\146\0\146\0\146\0\146"+
    "\0\u171c\0\u174f\0\u1782\0\u17b5\0\u17e8\0\63\0\u181b\0\u184e"+
    "\0\146\0\u1881\0\63\0\u18b4\0\u18e7\0\u191a\0\u194d\0\u1980"+
    "\0\u19b3\0\u19e6\0\u1a19\0\u1a4c\0\u1a7f\0\u1ab2\0\u1ae5\0\63";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[192];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\3\1\10"+
    "\2\3\1\11\1\12\1\13\1\14\1\3\1\15\1\16"+
    "\1\17\1\20\1\21\2\3\1\22\1\23\1\24\1\25"+
    "\1\26\1\27\1\5\1\3\1\30\1\31\1\32\1\33"+
    "\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43"+
    "\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53"+
    "\1\54\64\0\2\3\1\0\6\3\3\0\16\3\2\0"+
    "\1\3\27\0\1\4\63\0\1\5\30\0\1\5\27\0"+
    "\2\3\1\0\1\3\1\55\4\3\3\0\16\3\2\0"+
    "\1\3\26\0\2\3\1\0\6\3\3\0\5\3\1\56"+
    "\10\3\2\0\1\3\26\0\2\3\1\0\4\3\1\57"+
    "\1\60\3\0\1\3\1\61\7\3\1\62\4\3\2\0"+
    "\1\3\63\0\1\63\25\0\2\3\1\0\6\3\3\0"+
    "\1\3\1\64\14\3\2\0\1\3\26\0\2\3\1\0"+
    "\6\3\3\0\7\3\1\65\3\3\1\66\2\3\2\0"+
    "\1\3\26\0\2\3\1\0\2\3\1\67\3\3\3\0"+
    "\16\3\2\0\1\3\26\0\2\3\1\0\6\3\3\0"+
    "\1\3\1\70\14\3\2\0\1\3\26\0\2\3\1\0"+
    "\6\3\3\0\4\3\1\71\11\3\2\0\1\3\26\0"+
    "\2\3\1\0\4\3\1\72\1\3\3\0\4\3\1\73"+
    "\11\3\2\0\1\3\26\0\2\3\1\0\6\3\3\0"+
    "\6\3\1\74\1\75\6\3\2\0\1\3\26\0\2\3"+
    "\1\0\6\3\3\0\1\3\1\76\14\3\2\0\1\3"+
    "\26\0\2\3\1\0\1\77\1\3\1\100\1\101\2\3"+
    "\3\0\16\3\2\0\1\102\26\0\2\3\1\0\4\3"+
    "\1\103\1\3\3\0\16\3\2\0\1\3\26\0\2\3"+
    "\1\0\1\3\1\104\2\3\1\105\1\3\3\0\16\3"+
    "\2\0\1\3\42\0\1\106\10\0\1\107\72\0\1\110"+
    "\62\0\1\111\1\112\61\0\1\113\1\0\1\114\60\0"+
    "\1\115\66\0\1\116\63\0\1\117\55\0\1\120\62\0"+
    "\1\121\10\0\1\122\51\0\1\123\11\0\1\124\50\0"+
    "\1\125\64\0\1\126\23\0\2\3\1\0\2\3\1\127"+
    "\3\3\3\0\2\3\1\130\13\3\2\0\1\3\26\0"+
    "\2\3\1\0\1\131\5\3\3\0\10\3\1\132\5\3"+
    "\2\0\1\3\26\0\2\3\1\0\6\3\3\0\13\3"+
    "\1\133\2\3\2\0\1\3\26\0\2\3\1\0\4\3"+
    "\1\134\1\3\3\0\16\3\2\0\1\3\26\0\2\3"+
    "\1\0\6\3\3\0\2\3\1\135\13\3\2\0\1\3"+
    "\26\0\2\3\1\0\6\3\3\0\7\3\1\136\6\3"+
    "\2\0\1\3\26\0\2\3\1\0\6\3\3\0\2\3"+
    "\1\137\13\3\2\0\1\3\26\0\2\3\1\0\6\3"+
    "\3\0\11\3\1\140\4\3\2\0\1\3\26\0\2\3"+
    "\1\0\6\3\3\0\11\3\1\141\4\3\2\0\1\3"+
    "\26\0\2\3\1\0\1\142\5\3\3\0\16\3\2\0"+
    "\1\3\26\0\2\3\1\0\6\3\3\0\7\3\1\143"+
    "\6\3\2\0\1\3\26\0\2\3\1\0\6\3\3\0"+
    "\13\3\1\144\2\3\2\0\1\3\26\0\2\3\1\0"+
    "\6\3\3\0\4\3\1\145\11\3\2\0\1\3\26\0"+
    "\2\3\1\0\6\3\3\0\1\3\1\146\14\3\2\0"+
    "\1\3\26\0\2\3\1\0\1\147\5\3\3\0\16\3"+
    "\2\0\1\3\26\0\2\3\1\0\6\3\3\0\11\3"+
    "\1\150\4\3\2\0\1\3\26\0\2\3\1\0\1\3"+
    "\1\151\4\3\3\0\16\3\2\0\1\3\26\0\2\3"+
    "\1\0\6\3\3\0\13\3\1\152\2\3\2\0\1\3"+
    "\26\0\2\3\1\0\4\3\1\153\1\3\3\0\16\3"+
    "\2\0\1\3\26\0\2\3\1\0\6\3\3\0\11\3"+
    "\1\154\4\3\2\0\1\3\26\0\2\3\1\0\6\3"+
    "\3\0\11\3\1\155\4\3\2\0\1\3\26\0\2\3"+
    "\1\0\6\3\3\0\11\3\1\156\4\3\2\0\1\3"+
    "\26\0\2\3\1\0\6\3\3\0\2\3\1\157\13\3"+
    "\2\0\1\3\47\0\1\160\64\0\1\161\40\0\1\162"+
    "\61\0\2\3\1\0\3\3\1\163\2\3\3\0\16\3"+
    "\2\0\1\3\26\0\2\3\1\0\6\3\3\0\5\3"+
    "\1\164\10\3\2\0\1\3\26\0\2\3\1\0\6\3"+
    "\3\0\2\3\1\165\13\3\2\0\1\3\26\0\2\3"+
    "\1\0\6\3\3\0\11\3\1\166\4\3\2\0\1\3"+
    "\26\0\2\3\1\0\6\3\3\0\5\3\1\167\10\3"+
    "\2\0\1\3\26\0\2\3\1\0\1\3\1\170\4\3"+
    "\3\0\16\3\2\0\1\3\26\0\2\3\1\0\1\171"+
    "\5\3\3\0\16\3\2\0\1\3\26\0\2\3\1\0"+
    "\6\3\3\0\3\3\1\172\12\3\2\0\1\3\26\0"+
    "\2\3\1\0\6\3\3\0\1\3\1\173\14\3\2\0"+
    "\1\3\26\0\2\3\1\0\6\3\3\0\7\3\1\174"+
    "\6\3\2\0\1\3\26\0\2\3\1\0\6\3\3\0"+
    "\5\3\1\175\10\3\2\0\1\3\26\0\2\3\1\0"+
    "\6\3\3\0\10\3\1\176\5\3\2\0\1\3\26\0"+
    "\2\3\1\0\6\3\3\0\5\3\1\177\10\3\2\0"+
    "\1\3\26\0\2\3\1\0\6\3\3\0\13\3\1\200"+
    "\2\3\2\0\1\3\26\0\2\3\1\0\4\3\1\201"+
    "\1\3\3\0\16\3\2\0\1\3\26\0\2\3\1\0"+
    "\6\3\3\0\1\202\15\3\2\0\1\3\26\0\2\3"+
    "\1\0\6\3\3\0\2\3\1\203\6\3\1\204\4\3"+
    "\2\0\1\3\26\0\2\3\1\0\1\205\5\3\3\0"+
    "\16\3\2\0\1\3\26\0\2\3\1\0\6\3\3\0"+
    "\7\3\1\206\6\3\2\0\1\3\26\0\2\3\1\0"+
    "\1\207\5\3\3\0\16\3\2\0\1\3\26\0\2\3"+
    "\1\0\6\3\3\0\7\3\1\210\6\3\2\0\1\3"+
    "\26\0\2\3\1\0\6\3\3\0\7\3\1\211\6\3"+
    "\2\0\1\3\26\0\2\3\1\0\6\3\3\0\13\3"+
    "\1\212\2\3\2\0\1\3\50\0\1\213\46\0\1\214"+
    "\55\0\1\162\50\0\1\215\10\0\2\3\1\0\4\3"+
    "\1\216\1\3\3\0\16\3\2\0\1\3\26\0\2\3"+
    "\1\0\1\3\1\217\4\3\3\0\16\3\2\0\1\3"+
    "\26\0\2\3\1\0\6\3\3\0\13\3\1\220\2\3"+
    "\2\0\1\3\26\0\2\3\1\0\6\3\3\0\4\3"+
    "\1\221\11\3\2\0\1\3\26\0\2\3\1\0\6\3"+
    "\3\0\7\3\1\222\6\3\2\0\1\3\26\0\2\3"+
    "\1\0\6\3\3\0\10\3\1\223\5\3\2\0\1\3"+
    "\26\0\2\3\1\0\6\3\3\0\5\3\1\224\10\3"+
    "\2\0\1\3\26\0\2\3\1\0\1\225\5\3\3\0"+
    "\16\3\2\0\1\3\26\0\2\3\1\0\3\3\1\226"+
    "\2\3\3\0\16\3\2\0\1\3\26\0\2\3\1\0"+
    "\6\3\3\0\7\3\1\227\6\3\2\0\1\3\26\0"+
    "\2\3\1\0\6\3\3\0\5\3\1\230\10\3\2\0"+
    "\1\3\26\0\2\3\1\0\6\3\3\0\6\3\1\231"+
    "\7\3\2\0\1\3\26\0\2\3\1\0\3\3\1\232"+
    "\2\3\3\0\16\3\2\0\1\3\26\0\2\3\1\0"+
    "\1\233\5\3\3\0\16\3\2\0\1\3\26\0\2\3"+
    "\1\0\6\3\3\0\5\3\1\234\10\3\2\0\1\3"+
    "\53\0\1\235\55\0\1\236\42\0\2\3\1\0\1\237"+
    "\5\3\3\0\16\3\2\0\1\3\26\0\2\3\1\0"+
    "\6\3\3\0\7\3\1\240\6\3\2\0\1\3\26\0"+
    "\2\3\1\0\1\241\5\3\3\0\16\3\2\0\1\3"+
    "\26\0\2\3\1\0\6\3\3\0\5\3\1\242\10\3"+
    "\2\0\1\3\26\0\2\3\1\0\6\3\3\0\16\3"+
    "\1\0\1\243\1\3\26\0\2\3\1\0\1\244\5\3"+
    "\3\0\16\3\2\0\1\3\26\0\2\3\1\0\6\3"+
    "\3\0\10\3\1\245\5\3\2\0\1\3\26\0\2\3"+
    "\1\0\6\3\3\0\14\3\1\246\1\3\2\0\1\3"+
    "\26\0\2\3\1\0\5\3\1\247\3\0\16\3\2\0"+
    "\1\3\26\0\2\3\1\0\6\3\3\0\6\3\1\250"+
    "\7\3\2\0\1\3\51\0\1\251\55\0\1\252\44\0"+
    "\2\3\1\0\3\3\1\253\2\3\3\0\16\3\2\0"+
    "\1\3\26\0\2\3\1\0\6\3\3\0\5\3\1\254"+
    "\10\3\2\0\1\3\51\0\1\255\60\0\1\256\55\0"+
    "\1\257\46\0\2\3\1\0\5\3\1\260\3\0\16\3"+
    "\2\0\1\3\26\0\2\3\1\0\1\3\1\261\4\3"+
    "\3\0\16\3\2\0\1\3\35\0\1\262\74\0\1\263"+
    "\41\0\2\3\1\0\6\3\1\264\2\0\16\3\2\0"+
    "\1\3\56\0\1\265\43\0\1\266\72\0\1\267\40\0"+
    "\13\266\1\0\47\266\30\0\1\270\64\0\1\271\40\0"+
    "\1\272\61\0\1\273\75\0\1\274\74\0\1\275\56\0"+
    "\1\276\36\0\1\277\73\0\1\300\45\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[6936];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\7\1\2\11\23\1\2\11\4\1\10\11"+
    "\6\1\1\11\22\1\2\0\16\11\1\0\31\1\3\0"+
    "\30\1\2\0\1\11\17\1\2\0\4\1\1\0\5\1"+
    "\2\0\2\1\1\0\1\11\1\0\2\1\1\0\1\11"+
    "\2\0\1\1\11\0\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[192];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
    public String lexemas;


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexico(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  Lexico(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 132) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public Tokens yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 46: 
          { lexemas = yytext(); return True;
          }
        case 71: break;
        case 26: 
          { lexemas=yytext(); return Coma;
          }
        case 72: break;
        case 22: 
          { lexemas=yytext(); return Llave_c;
          }
        case 73: break;
        case 55: 
          { lexemas=yytext(); return Union;
          }
        case 74: break;
        case 42: 
          { lexemas = yytext(); return Desplazamiento_Izq;
          }
        case 75: break;
        case 7: 
          { lexemas=yytext(); return Comillas;
          }
        case 76: break;
        case 70: 
          { lexemas=yytext(); return Using;
          }
        case 77: break;
        case 12: 
          { lexemas=yytext(); return Op_And_BaB;
          }
        case 78: break;
        case 40: 
          { lexemas = yytext(); return Desplazamiento_Der;
          }
        case 79: break;
        case 16: 
          { lexemas=yytext(); return Op_Xor_BaB;
          }
        case 80: break;
        case 9: 
          { lexemas=yytext(); return Suma;
          }
        case 81: break;
        case 13: 
          { lexemas=yytext(); return Op_Or_BaB;
          }
        case 82: break;
        case 65: 
          { lexemas=yytext(); return Switch;
          }
        case 83: break;
        case 39: 
          { lexemas = yytext(); return Mayor_Igual;
          }
        case 84: break;
        case 33: 
          { lexemas = yytext(); return Op_asig_resta;
          }
        case 85: break;
        case 20: 
          { lexemas=yytext(); return Parentesis_c;
          }
        case 86: break;
        case 6: 
          { return Linea;
          }
        case 87: break;
        case 52: 
          { lexemas=yytext(); return Else;
          }
        case 88: break;
        case 24: 
          { lexemas = yytext(); return Corchete_c;
          }
        case 89: break;
        case 56: 
          { lexemas = yytext(); return False;
          }
        case 90: break;
        case 61: 
          { lexemas=yytext(); return Double;
          }
        case 91: break;
        case 47: 
          { lexemas=yytext(); return Case;
          }
        case 92: break;
        case 50: 
          { lexemas=yytext(); return Byte;
          }
        case 93: break;
        case 53: 
          { lexemas=yytext(); return Void;
          }
        case 94: break;
        case 15: 
          { lexemas=yytext(); return Op_Not_BaB;
          }
        case 95: break;
        case 36: 
          { lexemas=yytext(); return Op_And;
          }
        case 96: break;
        case 14: 
          { lexemas=yytext(); return Op_Not;
          }
        case 97: break;
        case 59: 
          { lexemas=yytext(); return Pause;
          }
        case 98: break;
        case 64: 
          { lexemas=yytext(); return Sistema;
          }
        case 99: break;
        case 58: 
          { lexemas=yytext(); return Scanf;
          }
        case 100: break;
        case 51: 
          { lexemas=yytext(); return Long;
          }
        case 101: break;
        case 30: 
          { lexemas = yytext(); return Igual_a;
          }
        case 102: break;
        case 25: 
          { lexemas=yytext(); return P_coma;
          }
        case 103: break;
        case 29: 
          { lexemas=yytext(); return If;
          }
        case 104: break;
        case 60: 
          { lexemas=yytext(); return Return;
          }
        case 105: break;
        case 41: 
          { lexemas = yytext(); return Menor_Igual;
          }
        case 106: break;
        case 38: 
          { lexemas = yytext(); return Diferente;
          }
        case 107: break;
        case 35: 
          { lexemas = yytext(); return Op_asig_multiplicacion;
          }
        case 108: break;
        case 17: 
          { lexemas = yytext(); return Mayorque;
          }
        case 109: break;
        case 28: 
          { lexemas = yytext(); return Op_asig_division;
          }
        case 110: break;
        case 62: 
          { lexemas=yytext(); return Struct;
          }
        case 111: break;
        case 21: 
          { lexemas=yytext(); return Llave_a;
          }
        case 112: break;
        case 2: 
          { lexemas=yytext(); return Identificador;
          }
        case 113: break;
        case 37: 
          { lexemas=yytext(); return Op_Or;
          }
        case 114: break;
        case 27: 
          { lexemas=yytext(); return Punto;
          }
        case 115: break;
        case 31: 
          { lexemas = yytext(); return Op_asig_suma;
          }
        case 116: break;
        case 34: 
          { lexemas = yytext(); return Op_decremento;
          }
        case 117: break;
        case 10: 
          { lexemas=yytext(); return Resta;
          }
        case 118: break;
        case 45: 
          { lexemas=yytext(); return Int;
          }
        case 119: break;
        case 32: 
          { lexemas = yytext(); return Op_incremento;
          }
        case 120: break;
        case 11: 
          { lexemas=yytext(); return Multiplicacion;
          }
        case 121: break;
        case 54: 
          { lexemas=yytext(); return Main;
          }
        case 122: break;
        case 44: 
          { lexemas=yytext(); return Cin;
          }
        case 123: break;
        case 66: 
          { lexemas=yytext(); return Printf;
          }
        case 124: break;
        case 1: 
          { return ERROR;
          }
        case 125: break;
        case 19: 
          { lexemas=yytext(); return Parentesis_a;
          }
        case 126: break;
        case 3: 
          { lexemas=yytext(); return Numero;
          }
        case 127: break;
        case 67: 
          { lexemas=yytext(); return Define;
          }
        case 128: break;
        case 68: 
          { lexemas=yytext(); return Register;
          }
        case 129: break;
        case 49: 
          { lexemas=yytext(); return Cout;
          }
        case 130: break;
        case 23: 
          { lexemas = yytext(); return Corchete_a;
          }
        case 131: break;
        case 5: 
          { lexemas=yytext(); return Division;
          }
        case 132: break;
        case 4: 
          { /*Ignore*/
          }
        case 133: break;
        case 69: 
          { lexemas=yytext(); return Include;
          }
        case 134: break;
        case 18: 
          { lexemas = yytext(); return Menorque;
          }
        case 135: break;
        case 8: 
          { lexemas=yytext(); return Igual;
          }
        case 136: break;
        case 57: 
          { lexemas=yytext(); return Float;
          }
        case 137: break;
        case 43: 
          { lexemas = yytext(); return Op_asig_modulo;
          }
        case 138: break;
        case 63: 
          { lexemas=yytext(); return Cadena;
          }
        case 139: break;
        case 48: 
          { lexemas=yytext(); return Char;
          }
        case 140: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            return null;
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}

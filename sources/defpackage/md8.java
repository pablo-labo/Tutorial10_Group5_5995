package defpackage;

import io.jsonwebtoken.JwtParser;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes3.dex */
public enum md8 {
    BOOLEAN(bnb.BOOLEAN, "boolean", "Z", "java.lang.Boolean"),
    CHAR(bnb.CHAR, "char", "C", "java.lang.Character"),
    BYTE(bnb.BYTE, "byte", "B", "java.lang.Byte"),
    SHORT(bnb.SHORT, "short", "S", "java.lang.Short"),
    INT(bnb.INT, "int", "I", "java.lang.Integer"),
    FLOAT(bnb.FLOAT, "float", "F", "java.lang.Float"),
    LONG(bnb.LONG, "long", "J", "java.lang.Long"),
    DOUBLE(bnb.DOUBLE, "double", "D", "java.lang.Double");

    private final String desc;
    private final String name;
    private final bnb primitiveType;
    private final mq5 wrapperFqName;
    public static final HashMap X = new HashMap();
    public static final EnumMap Y = new EnumMap(bnb.class);
    public static final HashMap Z = new HashMap();
    public static final HashSet a0 = new HashSet();
    public static final HashMap b0 = new HashMap();

    static {
        for (md8 md8Var : values()) {
            X.put(md8Var.f(), md8Var);
            Y.put(md8Var.h(), md8Var);
            Z.put(md8Var.e(), md8Var);
            String strReplace = md8Var.wrapperFqName.a.a.replace(JwtParser.SEPARATOR_CHAR, '/');
            a0.add(strReplace);
            b0.put(strReplace, z3.n(new StringBuilder("("), md8Var.desc, ")L", strReplace, ";"));
        }
    }

    md8(bnb bnbVar, String str, String str2, String str3) {
        if (bnbVar == null) {
            a(8);
            throw null;
        }
        this.primitiveType = bnbVar;
        this.name = str;
        this.desc = str2;
        this.wrapperFqName = new mq5(str3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void a(int r8) {
        /*
            Method dump skipped, instruction units count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.md8.a(int):void");
    }

    public static md8 c(String str) {
        md8 md8Var = (md8) X.get(str);
        if (md8Var != null) {
            return md8Var;
        }
        g7.l("Non-primitive type name passed: ".concat(str));
        return null;
    }

    public final String e() {
        String str = this.desc;
        if (str != null) {
            return str;
        }
        a(14);
        throw null;
    }

    public final String f() {
        String str = this.name;
        if (str != null) {
            return str;
        }
        a(13);
        throw null;
    }

    public final bnb h() {
        bnb bnbVar = this.primitiveType;
        if (bnbVar != null) {
            return bnbVar;
        }
        a(12);
        throw null;
    }

    public final mq5 m() {
        mq5 mq5Var = this.wrapperFqName;
        if (mq5Var != null) {
            return mq5Var;
        }
        a(15);
        throw null;
    }
}

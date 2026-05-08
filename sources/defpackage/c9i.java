package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF2' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes2.dex */
public class c9i {
    public static final /* synthetic */ c9i[] a;
    private final lai zzs;
    private final int zzt;

    /* JADX INFO: Fake field, exist only in values array */
    c9i EF0;

    /* JADX INFO: Fake field, exist only in values array */
    c9i EF1;

    /* JADX INFO: Fake field, exist only in values array */
    c9i EF2;

    static {
        c9i c9iVar = new c9i("DOUBLE", 0, lai.DOUBLE, 1);
        c9i c9iVar2 = new c9i("FLOAT", 1, lai.FLOAT, 5);
        lai laiVar = lai.LONG;
        c9i c9iVar3 = new c9i("INT64", 2, laiVar, 0);
        c9i c9iVar4 = new c9i("UINT64", 3, laiVar, 0);
        lai laiVar2 = lai.INT;
        c9i c9iVar5 = new c9i("INT32", 4, laiVar2, 0);
        c9i c9iVar6 = new c9i("FIXED64", 5, laiVar, 1);
        c9i c9iVar7 = new c9i("FIXED32", 6, laiVar2, 5);
        c9i c9iVar8 = new c9i("BOOL", 7, lai.BOOLEAN, 0);
        k9i k9iVar = new k9i("STRING", 8, lai.STRING, 2);
        lai laiVar3 = lai.MESSAGE;
        a = new c9i[]{c9iVar, c9iVar2, c9iVar3, c9iVar4, c9iVar5, c9iVar6, c9iVar7, c9iVar8, k9iVar, new g9i("GROUP", 9, laiVar3, 3), new q9i("MESSAGE", 10, laiVar3, 2), new n9i("BYTES", 11, lai.BYTE_STRING, 2), new c9i("UINT32", 12, laiVar2, 0), new c9i("ENUM", 13, lai.ENUM, 0), new c9i("SFIXED32", 14, laiVar2, 5), new c9i("SFIXED64", 15, laiVar, 1), new c9i("SINT32", 16, laiVar2, 0), new c9i("SINT64", 17, laiVar, 0)};
    }

    public c9i(String str, int i, lai laiVar, int i2) {
        this.zzs = laiVar;
        this.zzt = i2;
    }

    public static c9i[] values() {
        return (c9i[]) a.clone();
    }
}

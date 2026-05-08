package com.google.i18n.phonenumbers;

/* JADX INFO: loaded from: classes2.dex */
public class NumberParseException extends Exception {
    private a errorType;
    private String message;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        public static final a e;
        public static final /* synthetic */ a[] f;

        static {
            a aVar = new a("INVALID_COUNTRY_CODE", 0);
            a = aVar;
            a aVar2 = new a("NOT_A_NUMBER", 1);
            b = aVar2;
            a aVar3 = new a("TOO_SHORT_AFTER_IDD", 2);
            c = aVar3;
            a aVar4 = new a("TOO_SHORT_NSN", 3);
            d = aVar4;
            a aVar5 = new a("TOO_LONG", 4);
            e = aVar5;
            f = new a[]{aVar, aVar2, aVar3, aVar4, aVar5};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f.clone();
        }
    }

    public NumberParseException(a aVar, String str) {
        super(str);
        this.message = str;
        this.errorType = aVar;
    }

    public final a a() {
        return this.errorType;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "Error type: " + this.errorType + ". " + this.message;
    }
}

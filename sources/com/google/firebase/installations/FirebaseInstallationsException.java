package com.google.firebase.installations;

import com.google.firebase.FirebaseException;
import defpackage.fib;

/* JADX INFO: loaded from: classes2.dex */
public class FirebaseInstallationsException extends FirebaseException {
    private final a status;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final a c;
        public static final /* synthetic */ a[] d;

        static {
            a aVar = new a("BAD_CONFIG", 0);
            a = aVar;
            a aVar2 = new a("UNAVAILABLE", 1);
            b = aVar2;
            a aVar3 = new a("TOO_MANY_REQUESTS", 2);
            c = aVar3;
            d = new a[]{aVar, aVar2, aVar3};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) d.clone();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FirebaseInstallationsException(String str, a aVar) {
        super(str);
        fib.g(str, "Detail message must not be empty");
        this.status = aVar;
    }

    public FirebaseInstallationsException() {
        this.status = a.a;
    }
}

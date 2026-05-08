package defpackage;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class pqe {
    public static final /* synthetic */ int a = 0;

    public static final class a implements nqe {
        public final String a;
        public final String b;
        public final String c;
        public final int d;
        public final int e = -1;

        public a(String str, String str2, String str3, int i) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = i;
        }

        @Override // defpackage.nqe
        public final int a() {
            return this.d;
        }

        @Override // defpackage.nqe
        public final boolean b() {
            return false;
        }

        @Override // defpackage.nqe
        public final int getColumn() {
            return this.e;
        }

        @Override // defpackage.nqe
        public final String getFile() {
            return this.a;
        }

        @Override // defpackage.nqe
        public final String getFileName() {
            return this.b;
        }

        @Override // defpackage.nqe
        public final String getMethod() {
            return this.c;
        }
    }

    static {
        Pattern.compile("^(?:(.*?)@)?(.*?)\\:([0-9]+)\\:([0-9]+)$").getClass();
        Pattern.compile("\\s*(?:at)\\s*(.+?)\\s*[@(](.*):([0-9]+):([0-9]+)[)]$").getClass();
    }
}

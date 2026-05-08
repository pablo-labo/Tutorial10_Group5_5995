package defpackage;

import java.io.File;
import java.io.OutputStream;
import java.util.ArrayList;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class ba5 {
    public final File a;
    public final a b;
    public final String c;
    public final gu5<Long> d;
    public final Function2<File, String, OutputStream> e;
    public final b f;
    public final d2f g;
    public final j91 h;

    public static final class a {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return Long.hashCode(307200L) + w40.c(50, Long.hashCode(5184000000L) * 31, 31);
        }

        public final String toString() {
            return "Config(maxAge=5184000000, maxFileCount=50, maxFileSize=307200)";
        }
    }

    public static final class b {
        public final String a = t40.h();
        public int b = 0;
        public OutputStream c = null;
        public long d = 0;

        public b(int i) {
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return wl7.b(this.a, bVar.a) && this.b == bVar.b && wl7.b(this.c, bVar.c) && this.d == bVar.d;
        }

        public final int hashCode() {
            int iC = w40.c(this.b, this.a.hashCode() * 31, 31);
            OutputStream outputStream = this.c;
            return Long.hashCode(this.d) + ((iC + (outputStream == null ? 0 : outputStream.hashCode())) * 31);
        }

        public final String toString() {
            int i = this.b;
            OutputStream outputStream = this.c;
            long j = this.d;
            StringBuilder sbH = w40.h(i, "Session(sessionId=", this.a, ", fileIndex=", ", output=");
            sbH.append(outputStream);
            sbH.append(", currentSize=");
            sbH.append(j);
            sbH.append(")");
            return sbH.toString();
        }
    }

    public ba5() {
        throw null;
    }

    public ba5(File file, a aVar, String str) {
        j7 j7Var = new j7(3);
        ey1 ey1Var = new ey1(4, (byte) 0);
        str.getClass();
        this.a = file;
        this.b = aVar;
        this.c = str;
        this.d = j7Var;
        this.e = ey1Var;
        this.f = new b(0);
        this.g = new d2f(new l7(5));
        this.h = new j91(this, 6);
    }

    public static Object a(gu5 gu5Var) {
        try {
            return gu5Var.invoke();
        } catch (Exception e) {
            ArrayList arrayList = lz2.a;
            lz2.c("FileLogging", bg.e(e, "Unexpected exception "), false, e, 4);
            return null;
        }
    }
}

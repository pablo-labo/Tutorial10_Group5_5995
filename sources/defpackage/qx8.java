package defpackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class qx8 implements r6e<String> {
    public final BufferedReader a;

    public static final class a implements Iterator<String>, ze8 {
        public String a;
        public boolean b;

        public a() {
        }

        @Override // java.util.Iterator
        public final boolean hasNext() throws IOException {
            if (this.a == null && !this.b) {
                String line = qx8.this.a.readLine();
                this.a = line;
                if (line == null) {
                    this.b = true;
                }
            }
            return this.a != null;
        }

        @Override // java.util.Iterator
        public final String next() {
            if (!hasNext()) {
                k20.p();
                return null;
            }
            String str = this.a;
            this.a = null;
            str.getClass();
            return str;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public qx8(BufferedReader bufferedReader) {
        this.a = bufferedReader;
    }

    @Override // defpackage.r6e
    public final Iterator<String> iterator() {
        return new a();
    }
}

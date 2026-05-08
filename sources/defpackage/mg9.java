package defpackage;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public interface mg9 {
    public static final a a = new a();

    public class a implements mg9 {
        @Override // defpackage.mg9
        public final long a() {
            throw new NoSuchElementException();
        }

        @Override // defpackage.mg9
        public final long b() {
            throw new NoSuchElementException();
        }

        @Override // defpackage.mg9
        public final boolean next() {
            return false;
        }
    }

    long a();

    long b();

    boolean next();
}

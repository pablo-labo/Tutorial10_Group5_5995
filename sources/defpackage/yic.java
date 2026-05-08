package defpackage;

import java.io.ByteArrayOutputStream;
import org.apache.avro.g;

/* JADX INFO: loaded from: classes3.dex */
public class yic<D> {
    public static final ThreadLocal<qf1> b;
    public final xg3<D> a;

    public static class a extends ByteArrayOutputStream {
    }

    static {
        dmc.n(new xic());
        b = new ThreadLocal<>();
    }

    public yic(zoe zoeVar, g gVar) {
        this.a = new bpe(gVar, zoeVar);
    }
}

package defpackage;

import defpackage.fx9;
import defpackage.ke3;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class zq1<Data> implements fx9<byte[], Data> {
    public final b<Data> a;

    public static class a implements gx9<byte[], ByteBuffer> {

        /* JADX INFO: renamed from: zq1$a$a, reason: collision with other inner class name */
        public class C0495a implements b<ByteBuffer> {
            @Override // zq1.b
            public final Class<ByteBuffer> a() {
                return ByteBuffer.class;
            }

            @Override // zq1.b
            public final ByteBuffer b(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }
        }

        @Override // defpackage.gx9
        public final fx9<byte[], ByteBuffer> c(n1a n1aVar) {
            return new zq1(new C0495a());
        }
    }

    public interface b<Data> {
        Class<Data> a();

        Data b(byte[] bArr);
    }

    public static class c<Data> implements ke3<Data> {
        public final byte[] a;
        public final b<Data> b;

        public c(byte[] bArr, b<Data> bVar) {
            this.a = bArr;
            this.b = bVar;
        }

        @Override // defpackage.ke3
        public final Class<Data> a() {
            return this.b.a();
        }

        @Override // defpackage.ke3
        public final void b() {
        }

        @Override // defpackage.ke3
        public final void cancel() {
        }

        @Override // defpackage.ke3
        public final void d(knb knbVar, ke3.a<? super Data> aVar) {
            aVar.f(this.b.b(this.a));
        }

        @Override // defpackage.ke3
        public final xe3 e() {
            return xe3.a;
        }
    }

    public static class d implements gx9<byte[], InputStream> {

        public class a implements b<InputStream> {
            @Override // zq1.b
            public final Class<InputStream> a() {
                return InputStream.class;
            }

            @Override // zq1.b
            public final InputStream b(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }
        }

        @Override // defpackage.gx9
        public final fx9<byte[], InputStream> c(n1a n1aVar) {
            return new zq1(new a());
        }
    }

    public zq1(b<Data> bVar) {
        this.a = bVar;
    }

    @Override // defpackage.fx9
    public final fx9.a a(byte[] bArr, int i, int i2, ova ovaVar) {
        byte[] bArr2 = bArr;
        return new fx9.a(new nna(bArr2), new c(bArr2, this.a));
    }

    @Override // defpackage.fx9
    public final /* bridge */ /* synthetic */ boolean b(byte[] bArr) {
        return true;
    }
}

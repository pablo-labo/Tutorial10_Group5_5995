package defpackage;

import android.util.Base64;
import defpackage.fx9;
import defpackage.ke3;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class pf3<Model, Data> implements fx9<Model, Data> {
    public final b.a a;

    public static final class a<Data> implements ke3<Data> {
        public final String a;
        public final b.a b;
        public ByteArrayInputStream c;

        public a(String str, b.a aVar) {
            this.a = str;
            this.b = aVar;
        }

        @Override // defpackage.ke3
        public final Class<Data> a() {
            return InputStream.class;
        }

        @Override // defpackage.ke3
        public final void b() {
            try {
                this.c.close();
            } catch (IOException unused) {
            }
        }

        @Override // defpackage.ke3
        public final void cancel() {
        }

        @Override // defpackage.ke3
        public final void d(knb knbVar, ke3.a<? super Data> aVar) {
            try {
                ByteArrayInputStream byteArrayInputStreamA = this.b.a(this.a);
                this.c = byteArrayInputStreamA;
                aVar.f(byteArrayInputStreamA);
            } catch (IllegalArgumentException e) {
                aVar.c(e);
            }
        }

        @Override // defpackage.ke3
        public final xe3 e() {
            return xe3.a;
        }
    }

    public static final class b<Model> implements gx9<Model, InputStream> {
        public final a a = new a();

        public class a {
            public final ByteArrayInputStream a(String str) {
                if (!str.startsWith("data:image")) {
                    l5.q("Not a valid image data URL.");
                    return null;
                }
                int iIndexOf = str.indexOf(44);
                if (iIndexOf == -1) {
                    l5.q("Missing comma in data URL.");
                    return null;
                }
                if (str.substring(0, iIndexOf).endsWith(";base64")) {
                    return new ByteArrayInputStream(Base64.decode(str.substring(iIndexOf + 1), 0));
                }
                l5.q("Not a base64 image data URL.");
                return null;
            }
        }

        @Override // defpackage.gx9
        public final fx9<Model, InputStream> c(n1a n1aVar) {
            return new pf3(this.a);
        }
    }

    public pf3(b.a aVar) {
        this.a = aVar;
    }

    @Override // defpackage.fx9
    public final fx9.a<Data> a(Model model, int i, int i2, ova ovaVar) {
        return new fx9.a<>(new nna(model), new a(model.toString(), this.a));
    }

    @Override // defpackage.fx9
    public final boolean b(Model model) {
        return model.toString().startsWith("data:image");
    }
}

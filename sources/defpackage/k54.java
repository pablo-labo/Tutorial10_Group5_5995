package defpackage;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import defpackage.fx9;
import defpackage.ke3;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class k54<DataT> implements fx9<Integer, DataT> {
    public final Context a;
    public final e<DataT> b;

    public static final class a implements gx9<Integer, AssetFileDescriptor>, e<AssetFileDescriptor> {
        public final Context a;

        public a(Context context) {
            this.a = context;
        }

        @Override // k54.e
        public final Class<AssetFileDescriptor> a() {
            return AssetFileDescriptor.class;
        }

        @Override // k54.e
        public final void b(AssetFileDescriptor assetFileDescriptor) throws IOException {
            assetFileDescriptor.close();
        }

        @Override // defpackage.gx9
        public final fx9<Integer, AssetFileDescriptor> c(n1a n1aVar) {
            return new k54(this.a, this);
        }

        @Override // k54.e
        public final Object d(int i, Resources.Theme theme, Resources resources) {
            return resources.openRawResourceFd(i);
        }
    }

    public static final class b implements gx9<Integer, Drawable>, e<Drawable> {
        public final Context a;

        public b(Context context) {
            this.a = context;
        }

        @Override // k54.e
        public final Class<Drawable> a() {
            return Drawable.class;
        }

        @Override // k54.e
        public final /* bridge */ /* synthetic */ void b(Drawable drawable) {
        }

        @Override // defpackage.gx9
        public final fx9<Integer, Drawable> c(n1a n1aVar) {
            return new k54(this.a, this);
        }

        @Override // k54.e
        public final Object d(int i, Resources.Theme theme, Resources resources) {
            Context context = this.a;
            return mb4.a(context, context, i, theme);
        }
    }

    public static final class c implements gx9<Integer, InputStream>, e<InputStream> {
        public final Context a;

        public c(Context context) {
            this.a = context;
        }

        @Override // k54.e
        public final Class<InputStream> a() {
            return InputStream.class;
        }

        @Override // k54.e
        public final void b(InputStream inputStream) throws IOException {
            inputStream.close();
        }

        @Override // defpackage.gx9
        public final fx9<Integer, InputStream> c(n1a n1aVar) {
            return new k54(this.a, this);
        }

        @Override // k54.e
        public final Object d(int i, Resources.Theme theme, Resources resources) {
            return resources.openRawResource(i);
        }
    }

    public static final class d<DataT> implements ke3<DataT> {
        public final Resources.Theme a;
        public final Resources b;
        public final e<DataT> c;
        public final int d;
        public DataT e;

        public d(Resources.Theme theme, Resources resources, e<DataT> eVar, int i) {
            this.a = theme;
            this.b = resources;
            this.c = eVar;
            this.d = i;
        }

        @Override // defpackage.ke3
        public final Class<DataT> a() {
            return this.c.a();
        }

        @Override // defpackage.ke3
        public final void b() {
            DataT datat = this.e;
            if (datat != null) {
                try {
                    this.c.b(datat);
                } catch (IOException unused) {
                }
            }
        }

        @Override // defpackage.ke3
        public final void cancel() {
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [DataT, java.lang.Object] */
        @Override // defpackage.ke3
        public final void d(knb knbVar, ke3.a<? super DataT> aVar) {
            try {
                ?? r4 = (DataT) this.c.d(this.d, this.a, this.b);
                this.e = r4;
                aVar.f(r4);
            } catch (Resources.NotFoundException e) {
                aVar.c(e);
            }
        }

        @Override // defpackage.ke3
        public final xe3 e() {
            return xe3.a;
        }
    }

    public interface e<DataT> {
        Class<DataT> a();

        void b(DataT datat);

        Object d(int i, Resources.Theme theme, Resources resources);
    }

    public k54(Context context, e<DataT> eVar) {
        this.a = context.getApplicationContext();
        this.b = eVar;
    }

    @Override // defpackage.fx9
    public final fx9.a a(Integer num, int i, int i2, ova ovaVar) {
        Integer num2 = num;
        Resources.Theme theme = (Resources.Theme) ovaVar.c(l5d.b);
        return new fx9.a(new nna(num2), new d(theme, theme != null ? theme.getResources() : this.a.getResources(), this.b, num2.intValue()));
    }

    @Override // defpackage.fx9
    public final /* bridge */ /* synthetic */ boolean b(Integer num) {
        return true;
    }
}

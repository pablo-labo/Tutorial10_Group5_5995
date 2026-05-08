package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.Registry;
import com.bumptech.glide.a;
import com.bumptech.glide.c;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.data.c;
import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser;
import com.bumptech.glide.load.resource.bitmap.VideoDecoder;
import defpackage.e6d;
import defpackage.fve;
import defpackage.gd0;
import defpackage.k54;
import defpackage.kr1;
import defpackage.ku0;
import defpackage.m6g;
import defpackage.ml6;
import defpackage.or1;
import defpackage.pf3;
import defpackage.phg;
import defpackage.sm9;
import defpackage.tm9;
import defpackage.u95;
import defpackage.um9;
import defpackage.v5d;
import defpackage.v8c;
import defpackage.vig;
import defpackage.xhg;
import defpackage.zq1;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class nyc {
    public static Registry a(a aVar, ArrayList arrayList) {
        Class cls;
        j5d fr1Var;
        j5d iueVar;
        int i;
        Class cls2;
        bh1 bh1Var = aVar.a;
        kt0 kt0Var = aVar.d;
        c cVar = aVar.c;
        Context applicationContext = cVar.getApplicationContext();
        l96 l96Var = cVar.g;
        Registry registry = new Registry();
        DefaultImageHeaderParser defaultImageHeaderParser = new DefaultImageHeaderParser();
        fz1 fz1Var = registry.g;
        synchronized (fz1Var) {
            ((ArrayList) fz1Var.a).add(defaultImageHeaderParser);
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 27) {
            f25 f25Var = new f25();
            fz1 fz1Var2 = registry.g;
            synchronized (fz1Var2) {
                cls = AssetFileDescriptor.class;
                ((ArrayList) fz1Var2.a).add(f25Var);
            }
        } else {
            cls = AssetFileDescriptor.class;
        }
        Resources resources = applicationContext.getResources();
        ArrayList arrayListE = registry.e();
        lr1 lr1Var = new lr1(applicationContext, arrayListE, bh1Var, kt0Var);
        VideoDecoder videoDecoder = new VideoDecoder(bh1Var, new VideoDecoder.g());
        h94 h94Var = new h94(registry.e(), resources.getDisplayMetrics(), bh1Var, kt0Var);
        if (i2 < 28 || !l96Var.a.containsKey(i96.class)) {
            fr1Var = new fr1(h94Var);
            iueVar = new iue(h94Var, kt0Var);
        } else {
            iueVar = new gf7();
            fr1Var = new gr1();
        }
        if (i2 >= 28) {
            i = i2;
            registry.d("Animation", InputStream.class, Drawable.class, new gd0.c(new gd0(arrayListE, kt0Var)));
            registry.d("Animation", ByteBuffer.class, Drawable.class, new gd0.b(new gd0(arrayListE, kt0Var)));
        } else {
            i = i2;
        }
        l5d l5dVar = new l5d(applicationContext);
        hg1 hg1Var = new hg1(kt0Var);
        cg1 cg1Var = new cg1();
        u63 u63Var = new u63(19);
        ContentResolver contentResolver = applicationContext.getContentResolver();
        registry.a(ByteBuffer.class, new mh2(18));
        registry.a(InputStream.class, new n2i(kt0Var, 2));
        registry.d("Bitmap", ByteBuffer.class, Bitmap.class, fr1Var);
        registry.d("Bitmap", InputStream.class, Bitmap.class, iueVar);
        String str = Build.FINGERPRINT;
        if ("robolectric".equals(str)) {
            cls2 = ParcelFileDescriptor.class;
        } else {
            z3b z3bVar = new z3b(h94Var);
            cls2 = ParcelFileDescriptor.class;
            registry.d("Bitmap", cls2, Bitmap.class, z3bVar);
        }
        registry.d("Bitmap", cls, Bitmap.class, new VideoDecoder(bh1Var, new VideoDecoder.c()));
        registry.d("Bitmap", cls2, Bitmap.class, videoDecoder);
        m6g.a<?> aVar2 = m6g.a.a;
        registry.c(Bitmap.class, Bitmap.class, aVar2);
        registry.d("Bitmap", Bitmap.class, Bitmap.class, new k6g());
        registry.b(Bitmap.class, hg1Var);
        registry.d("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new fg1(resources, fr1Var));
        registry.d("BitmapDrawable", InputStream.class, BitmapDrawable.class, new fg1(resources, iueVar));
        registry.d("BitmapDrawable", cls2, BitmapDrawable.class, new fg1(resources, videoDecoder));
        registry.b(BitmapDrawable.class, new gg1(bh1Var, hg1Var));
        registry.d("Animation", InputStream.class, v86.class, new kue(arrayListE, lr1Var, kt0Var));
        registry.d("Animation", ByteBuffer.class, v86.class, lr1Var);
        registry.b(v86.class, new h4(19));
        registry.c(u86.class, u86.class, aVar2);
        registry.d("Bitmap", u86.class, Bitmap.class, new a96(bh1Var));
        registry.d("legacy_append", Uri.class, Drawable.class, l5dVar);
        registry.d("legacy_append", Uri.class, Bitmap.class, new g5d(l5dVar, bh1Var));
        registry.h(new or1.a());
        registry.c(File.class, ByteBuffer.class, new kr1.b());
        registry.c(File.class, InputStream.class, new u95.e(new w95()));
        registry.d("legacy_append", File.class, File.class, new i95());
        registry.c(File.class, cls2, new u95.b(new v95()));
        registry.c(File.class, File.class, aVar2);
        registry.h(new c.a(kt0Var));
        if (!"robolectric".equals(str)) {
            registry.h(new ParcelFileDescriptorRewinder.a());
        }
        k54.c cVar2 = new k54.c(applicationContext);
        k54.a aVar3 = new k54.a(applicationContext);
        k54.b bVar = new k54.b(applicationContext);
        Class cls3 = Integer.TYPE;
        registry.c(cls3, InputStream.class, cVar2);
        registry.c(Integer.class, InputStream.class, cVar2);
        Class cls4 = cls;
        registry.c(cls3, cls4, aVar3);
        registry.c(Integer.class, cls4, aVar3);
        registry.c(cls3, Drawable.class, bVar);
        registry.c(Integer.class, Drawable.class, bVar);
        registry.c(Uri.class, InputStream.class, new e6d.b(applicationContext));
        registry.c(Uri.class, cls4, new e6d.a(applicationContext));
        v5d.c cVar3 = new v5d.c(resources);
        v5d.a aVar4 = new v5d.a(resources);
        v5d.b bVar2 = new v5d.b(resources);
        registry.c(Integer.class, Uri.class, cVar3);
        registry.c(cls3, Uri.class, cVar3);
        registry.c(Integer.class, cls4, aVar4);
        registry.c(cls3, cls4, aVar4);
        registry.c(Integer.class, InputStream.class, bVar2);
        registry.c(cls3, InputStream.class, bVar2);
        registry.c(String.class, InputStream.class, new pf3.b());
        registry.c(Uri.class, InputStream.class, new pf3.b());
        registry.c(String.class, InputStream.class, new fve.c());
        registry.c(String.class, cls2, new fve.b());
        registry.c(String.class, cls4, new fve.a());
        registry.c(Uri.class, InputStream.class, new ku0.c(applicationContext.getAssets()));
        registry.c(Uri.class, cls4, new ku0.b(applicationContext.getAssets()));
        registry.c(Uri.class, InputStream.class, new tm9.a(applicationContext));
        registry.c(Uri.class, InputStream.class, new um9.a(applicationContext));
        if (i >= 29) {
            registry.c(Uri.class, InputStream.class, new v8c.c(applicationContext, InputStream.class));
            registry.c(Uri.class, cls2, new v8c.b(applicationContext, cls2));
        }
        registry.c(Uri.class, InputStream.class, new phg.d(contentResolver));
        registry.c(Uri.class, cls2, new phg.b(contentResolver));
        registry.c(Uri.class, cls4, new phg.a(contentResolver));
        registry.c(Uri.class, InputStream.class, new vig.a());
        registry.c(URL.class, InputStream.class, new xhg.a());
        registry.c(Uri.class, File.class, new sm9.a(applicationContext));
        registry.c(p96.class, InputStream.class, new ml6.a());
        registry.c(byte[].class, ByteBuffer.class, new zq1.a());
        registry.c(byte[].class, InputStream.class, new zq1.d());
        registry.c(Uri.class, Uri.class, aVar2);
        registry.c(Drawable.class, Drawable.class, aVar2);
        registry.d("legacy_append", Drawable.class, Drawable.class, new l6g());
        registry.i(Bitmap.class, BitmapDrawable.class, new h00(resources));
        registry.i(Bitmap.class, byte[].class, cg1Var);
        lb4 lb4Var = new lb4();
        lb4Var.a = bh1Var;
        lb4Var.b = cg1Var;
        lb4Var.c = u63Var;
        registry.i(Drawable.class, byte[].class, lb4Var);
        registry.i(v86.class, byte[].class, u63Var);
        VideoDecoder videoDecoder2 = new VideoDecoder(bh1Var, new VideoDecoder.d());
        registry.d("legacy_append", ByteBuffer.class, Bitmap.class, videoDecoder2);
        registry.d("legacy_append", ByteBuffer.class, BitmapDrawable.class, new fg1(resources, videoDecoder2));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m96 m96Var = (m96) it.next();
            try {
                m96Var.a();
            } catch (AbstractMethodError e) {
                ja.m("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: ".concat(m96Var.getClass().getName()), e);
                return null;
            }
        }
        return registry;
    }
}

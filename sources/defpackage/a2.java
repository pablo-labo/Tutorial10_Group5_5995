package defpackage;

import android.graphics.drawable.Animatable;
import defpackage.a2;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a2<BUILDER extends a2<BUILDER, REQUEST, IMAGE, INFO>, REQUEST, IMAGE, INFO> {
    public static final a g = new a();
    public static final NullPointerException h = new NullPointerException("No image request was specified!");
    public static final AtomicLong i = new AtomicLong();
    public Object a;
    public com.facebook.imagepipeline.request.a b;
    public com.facebook.imagepipeline.request.a c;
    public vu2<? super INFO> d;
    public boolean e;
    public gc4 f;

    public class a extends z81<Object> {
        @Override // defpackage.z81, defpackage.vu2
        public final void j(String str, Object obj, Animatable animatable) {
            if (animatable != null) {
                animatable.start();
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        public static final b a;
        public static final /* synthetic */ b[] b;

        static {
            b bVar = new b("FULL_FETCH", 0);
            a = bVar;
            b = new b[]{bVar, new b("DISK_CACHE", 1), new b("BITMAP_MEMORY_CACHE", 2)};
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) b.clone();
        }
    }

    public final z1 a() {
        com.facebook.imagepipeline.request.a aVar;
        if (this.b == null && (aVar = this.c) != null) {
            this.b = aVar;
            this.c = null;
        }
        it5.a();
        nab nabVarD = d();
        vu2<? super INFO> vu2Var = this.d;
        if (vu2Var != null) {
            nabVarD.f(vu2Var);
        }
        if (this.e) {
            nabVarD.f(g);
        }
        it5.a();
        return nabVarD;
    }

    public abstract u1 b(nab nabVar, String str, Object obj, Object obj2, b bVar);

    public final void c() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = false;
        this.f = null;
    }

    public abstract nab d();

    public final gze e(nab nabVar, String str) {
        a2<BUILDER, REQUEST, IMAGE, INFO> a2Var;
        nab nabVar2;
        String str2;
        gze d77Var;
        com.facebook.imagepipeline.request.a aVar = this.b;
        b bVar = b.a;
        if (aVar != null) {
            a2Var = this;
            nabVar2 = nabVar;
            str2 = str;
            d77Var = new b2(a2Var, nabVar2, str2, aVar, this.a, bVar);
        } else {
            a2Var = this;
            nabVar2 = nabVar;
            str2 = str;
            d77Var = null;
        }
        if (d77Var != null && a2Var.c != null) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(d77Var);
            arrayList.add(new b2(a2Var, nabVar2, str2, a2Var.c, a2Var.a, bVar));
            d77Var = new d77(arrayList);
        }
        return d77Var == null ? new ff3() : d77Var;
    }
}

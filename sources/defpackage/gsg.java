package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.util.TypedValue;
import android.view.View;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import defpackage.epg;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class gsg {

    public static class a implements tpa {
        public final /* synthetic */ b a;
        public final /* synthetic */ c b;

        public a(b bVar, c cVar) {
            this.a = bVar;
            this.b = cVar;
        }

        @Override // defpackage.tpa
        public final rzg b(View view, rzg rzgVar) {
            c cVar = new c();
            c cVar2 = this.b;
            cVar.a = cVar2.a;
            cVar.b = cVar2.b;
            cVar.c = cVar2.c;
            cVar.d = cVar2.d;
            return this.a.a(view, rzgVar, cVar);
        }
    }

    public interface b {
        rzg a(View view, rzg rzgVar, c cVar);
    }

    public static class c {
        public int a;
        public int b;
        public int c;
        public int d;
    }

    public static void a(View view, b bVar) {
        WeakHashMap<View, prg> weakHashMap = epg.a;
        int paddingStart = view.getPaddingStart();
        int paddingTop = view.getPaddingTop();
        int paddingEnd = view.getPaddingEnd();
        int paddingBottom = view.getPaddingBottom();
        c cVar = new c();
        cVar.a = paddingStart;
        cVar.b = paddingTop;
        cVar.c = paddingEnd;
        cVar.d = paddingBottom;
        epg.d.m(view, new a(bVar, cVar));
        if (view.isAttachedToWindow()) {
            epg.c.c(view);
        } else {
            view.addOnAttachStateChangeListener(new hsg());
        }
    }

    public static float b(Context context, int i) {
        return TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }

    public static boolean c(View view) {
        WeakHashMap<View, prg> weakHashMap = epg.a;
        return view.getLayoutDirection() == 1;
    }

    public static PorterDuff.Mode d(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}

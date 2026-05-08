package defpackage;

import android.content.Context;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.facebook.react.runtime.ReactHostImpl;
import com.facebook.react.runtime.ReactInstance;
import com.indeed.android.jobsearch.bottomnav.IanMainFragment;
import defpackage.kv8;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ur implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ur(us2 us2Var, s7g s7gVar, ex7 ex7Var, afa afaVar) {
        this.a = 1;
        this.b = us2Var;
        this.c = ex7Var;
        this.d = afaVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v6, types: [sp6] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                Function2 function2 = (Function2) obj4;
                g4a g4aVar = (g4a) obj2;
                String str = (String) obj;
                str.getClass();
                if (wve.E(((Locale) ((g4a) obj3).getValue()).getCountry(), "US", true)) {
                    function2.invoke(str, (String) g4aVar.getValue());
                }
                return j6g.a;
            case 1:
                us2 us2Var = (us2) obj4;
                ex7 ex7Var = (ex7) obj3;
                afa afaVar = (afa) obj2;
                float fFloatValue = ((Float) obj).floatValue();
                float f = us2Var.f0 ? 1.0f : -1.0f;
                xsd xsdVar = us2Var.e0;
                float fG = xsdVar.g(xsdVar.e(afaVar.a(xsdVar.e(xsdVar.h(f * fFloatValue))))) * f;
                if (Math.abs(fG) < Math.abs(fFloatValue)) {
                    CancellationException cancellationException = new CancellationException("Scroll animation cancelled because scroll was not consumed (" + fG + " < " + fFloatValue + ')');
                    cancellationException.initCause(null);
                    ex7Var.h(cancellationException);
                }
                return j6g.a;
            case 2:
                final IanMainFragment ianMainFragment = (IanMainFragment) obj4;
                final Context context = (Context) obj2;
                final g4a g4aVar2 = (g4a) obj3;
                ((m74) obj).getClass();
                ianMainFragment.d0 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: sp6
                    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                    public final void onGlobalLayout() {
                        dr5 dr5Var;
                        IanMainFragment ianMainFragment2 = ianMainFragment;
                        if (ianMainFragment2.getLifecycle().b().compareTo(kv8.b.e) < 0 || (dr5Var = ianMainFragment2.c0) == null) {
                            return;
                        }
                        FrameLayout frameLayout = dr5Var.a;
                        frameLayout.getClass();
                        Boolean boolA = hh8.a(context, frameLayout, new ip6(ianMainFragment2, 1));
                        g4aVar2.setValue(Boolean.valueOf(boolA != null ? boolA.booleanValue() : false));
                    }
                };
                dr5 dr5Var = ianMainFragment.c0;
                dr5Var.getClass();
                dr5Var.a.getViewTreeObserver().addOnGlobalLayoutListener(ianMainFragment.d0);
                return new xp6(ianMainFragment);
            default:
                ReactInstance reactInstance = (ReactInstance) obj;
                AtomicInteger atomicInteger = ReactHostImpl.A;
                reactInstance.getClass();
                ((ReactHostImpl) obj4).t((String) obj3, "Execute");
                reactInstance.i((qoc) obj2);
                return j6g.a;
        }
    }

    public /* synthetic */ ur(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public /* synthetic */ ur(IanMainFragment ianMainFragment, Context context, g4a g4aVar) {
        this.a = 2;
        this.b = ianMainFragment;
        this.d = context;
        this.c = g4aVar;
    }
}

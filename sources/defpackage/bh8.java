package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import defpackage.dh8;
import defpackage.epg;
import defpackage.sp7;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class bh8 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ bh8(Object obj, Object obj2, Function1 function1, int i) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.b = function1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [android.view.ViewTreeObserver$OnGlobalLayoutListener, ch8] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        final Function1 function1 = this.b;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.c;
                final View view = (View) obj2;
                ((m74) obj).getClass();
                ?? r10 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: ch8
                    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                    public final void onGlobalLayout() {
                        WeakHashMap<View, prg> weakHashMap = epg.a;
                        rzg rzgVarA = epg.e.a(view);
                        function1.invoke(Boolean.valueOf(rzgVarA != null ? rzgVarA.a.q(8) : true));
                    }
                };
                viewTreeObserver.addOnGlobalLayoutListener(r10);
                return new dh8.a(viewTreeObserver, r10);
            default:
                Function2 function2 = (Function2) obj2;
                String str = (String) obj;
                hvb hvbVar = hvb.b0;
                if (str != null) {
                    ((tp7) cr8.p(tp7.class)).b(new sp7.g("profile-tab", "edit-military-experience", null, null, 12));
                    function2.invoke(hvbVar, str);
                } else {
                    ((tp7) cr8.p(tp7.class)).b(new sp7.g("profile-tab", "add-military-experience", null, null, 12));
                    function1.invoke(hvbVar);
                }
                return j6g.a;
        }
    }
}

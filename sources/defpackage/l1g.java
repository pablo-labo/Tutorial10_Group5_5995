package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.g;
import defpackage.epg;
import java.util.WeakHashMap;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u0003¨\u0006\u000f"}, d2 = {"Ll1g;", "Liw8;", "<init>", "()V", "", "tryHandleBackNavigation", "()Z", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lj6g;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "close", "uiplugin_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class l1g extends iw8 {
    public static final int $stable = 8;

    public static final class a extends wpa {
        public a() {
            super(true);
        }

        @Override // defpackage.wpa
        public final void b() {
            l1g l1gVar = l1g.this;
            if (l1gVar.tryHandleBackNavigation()) {
                return;
            }
            f(false);
            l1gVar.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final rzg onViewCreated$lambda$1(View view, rzg rzgVar) {
        view.getClass();
        rzgVar.getClass();
        kf7 kf7VarG = rzgVar.a.g(7);
        kf7VarG.getClass();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            ja.k("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.leftMargin = kf7VarG.a;
        marginLayoutParams.bottomMargin = kf7VarG.d;
        marginLayoutParams.rightMargin = kf7VarG.c;
        view.setLayoutParams(marginLayoutParams);
        return rzg.b;
    }

    public final void close() {
        i1g i1gVar = (i1g) cr8.p(i1g.class);
        lr5 lr5VarU = requireActivity().u();
        lr5VarU.getClass();
        i1gVar.b(lr5VarU, this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        dqa dqaVarR;
        view.getClass();
        super.onViewCreated(view, savedInstanceState);
        g activity = getActivity();
        if (activity != null && (dqaVarR = activity.r()) != null) {
            zv8 viewLifecycleOwner = getViewLifecycleOwner();
            viewLifecycleOwner.getClass();
            dqaVarR.a(viewLifecycleOwner, new a());
        }
        k1g k1gVar = new k1g();
        WeakHashMap<View, prg> weakHashMap = epg.a;
        epg.d.m(view, k1gVar);
    }

    public boolean tryHandleBackNavigation() {
        return false;
    }
}

package defpackage;

import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.rnonboarding.utils.RNOnboardingBottomSheetFragmentUtils$dismissBottomSheet$1", f = "RNOnboardingBottomSheetFragmentUtils.kt", l = {}, m = "invokeSuspend")
public final class bec extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ FragmentManager $fragmentManager;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bec(FragmentManager fragmentManager, lu2<? super bec> lu2Var) {
        super(2, lu2Var);
        this.$fragmentManager = fragmentManager;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new bec(this.$fragmentManager, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((bec) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        try {
            Fragment fragmentD = this.$fragmentManager.D("RnOnboardingBottomSheet");
            kbc kbcVar = fragmentD instanceof kbc ? (kbc) fragmentD : null;
            if (kbcVar != null) {
                kbcVar.E();
                ArrayList arrayList = lz2.a;
                Log.d("RNOnboardingBottomSheetFragmentUtils", "Successfully closed RnOnboarding bottom sheet", null);
            } else {
                ArrayList arrayList2 = lz2.a;
                Log.d("RNOnboardingBottomSheetFragmentUtils", "RnOnboarding bottom sheet already closed", null);
            }
        } catch (Exception e) {
            ArrayList arrayList3 = lz2.a;
            lz2.b("RNOnboardingBottomSheetFragmentUtils", "Error closing RnOnboarding bottom sheet: " + e.getMessage(), false, e);
        }
        return j6g.a;
    }
}

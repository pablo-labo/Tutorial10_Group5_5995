package defpackage;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import defpackage.aec;
import defpackage.e9a;
import defpackage.kbc;
import java.util.ArrayList;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes3.dex */
public final class aec {

    @uh3(c = "com.indeed.android.rnonboarding.utils.RNOnboardingBottomSheetFragmentUtils$createOnboardingBottomSheet$jsonCallback$1$1", f = "RNOnboardingBottomSheetFragmentUtils.kt", l = {}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ Function1<rra, j6g> $callback;
        final /* synthetic */ huc $callbackTriggered;
        final /* synthetic */ rra $result;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(huc hucVar, Function1<? super rra, j6g> function1, rra rraVar, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.$callbackTriggered = hucVar;
            this.$callback = function1;
            this.$result = rraVar;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new a(this.$callbackTriggered, this.$callback, this.$result, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            this.$callbackTriggered.element = true;
            this.$callback.invoke(this.$result);
            return j6g.a;
        }
    }

    public static kbc a(er7 er7Var, final FragmentManager fragmentManager, String str, String str2, final Function1 function1) {
        fragmentManager.getClass();
        String string = UUID.randomUUID().toString();
        string.getClass();
        final huc hucVar = new huc();
        com.indeed.android.uiplugin.oneoff.a.a.a(new vo7(string, new Function1() { // from class: zdc
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                JsonElement jsonElement;
                String string2;
                JsonObject jsonObject = (JsonObject) obj;
                String strT0 = (jsonObject == null || (jsonElement = (JsonElement) jsonObject.get("type")) == null || (string2 = jsonElement.toString()) == null) ? null : zve.t0(string2, '\"');
                rra rraVar = rra.b;
                if (strT0 == null) {
                    ArrayList arrayList = lz2.a;
                    lz2.c("RNOnboardingBottomSheetFragmentUtils", "Onboarding callback payload missing required field - 'type'", false, null, 8);
                } else if (strT0.equals("completed")) {
                    rraVar = rra.a;
                }
                eq3 eq3Var = a74.a;
                k89 k89Var = m89.a;
                u63.Y(f13.a(k89Var), null, null, new aec.a(hucVar, function1, rraVar, null), 3);
                u63.Y(f13.a(k89Var), null, null, new bec(fragmentManager, null), 3);
                return j6g.a;
            }
        }));
        cec cecVar = new cec(e9a.a.a(((kr7) cr8.p(kr7.class)).b(), ((kr7) cr8.p(kr7.class)).c()), string, er7Var.a, b(er7Var.b), Boolean.valueOf(er7Var.c), str, str2);
        kbc.a aVar = kbc.p0;
        ti tiVar = new ti(9, hucVar, string);
        aVar.getClass();
        return kbc.a.a("Onboarding", cecVar, "onboarding", 1.0d, false, tiVar);
    }

    public static Bundle b(Map map) {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value instanceof String) {
                bundle.putString(str, (String) value);
            } else if (value instanceof Integer) {
                bundle.putInt(str, ((Number) value).intValue());
            } else if (value instanceof Long) {
                bundle.putLong(str, ((Number) value).longValue());
            } else if (value instanceof Double) {
                bundle.putDouble(str, ((Number) value).doubleValue());
            } else if (value instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) value).booleanValue());
            } else if (value instanceof Bundle) {
                bundle.putBundle(str, (Bundle) value);
            } else if (value instanceof Map) {
                bundle.putBundle(str, b((Map) value));
            } else {
                bundle.putString(str, value.toString());
            }
        }
        return bundle;
    }
}

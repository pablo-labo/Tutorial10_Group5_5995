package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.util.Log;
import androidx.fragment.app.Fragment;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.indeed.android.jobsearch.tare.nav.a;
import com.indeed.android.messaging.data.events.EventRecord;
import com.indeed.android.uiplugin.oneoff.JSONCallbackError;
import defpackage.p85;
import expo.modules.imagepicker.FailedToReadFileException;
import expo.modules.imagepicker.MissingModuleException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.concurrent.ExecutionException;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ti implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ti(lr5 lr5Var, Function1 function1, a aVar) {
        this.a = 6;
        this.b = lr5Var;
        this.c = function1;
    }

    @Override // defpackage.gu5
    public final Object invoke() throws MissingModuleException, FailedToReadFileException {
        Object obj;
        int i = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((iba) obj3).p("SCHOOL_NAME");
                ((luc) obj2).element = "";
                return j6g.a;
            case 1:
                sl8 sl8VarInvoke = ((sa0) obj3).c.invoke();
                return ((zcf) obj2).O0(sl8VarInvoke).i(sl8VarInvoke.a0(0L));
            case 2:
                ((Function1) obj3).invoke((EventRecord.Attachment) obj2);
                return j6g.a;
            case 3:
                return u63.Z(new Pair((p85.a) obj3, (yd8) obj2));
            case 4:
                Uri uri = (Uri) obj2;
                try {
                    obj = ((bn2) obj3).a.b().a.a.get(o17.class);
                } catch (Exception unused) {
                    obj = null;
                }
                o17 o17Var = (o17) obj;
                if (o17Var == null) {
                    throw new MissingModuleException("Module 'ImageLoader' not found. Are you sure all modules are linked correctly?", null);
                }
                try {
                    return (Bitmap) o17Var.b(uri.toString()).get();
                } catch (ExecutionException e) {
                    throw new FailedToReadFileException(ojd.k(uri), e);
                }
                break;
            case 5:
                u47.b((v47) obj3, (gu5) obj2);
                return j6g.a;
            case 6:
                lr5 lr5Var = (lr5) obj3;
                Function1<? super mq7, j6g> function1 = (Function1) obj2;
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(lr5Var);
                Fragment fragmentD = lr5Var.D("PassportSignInWebViewFragment");
                if (fragmentD != null) {
                    ((h5b) fragmentD).E();
                }
                h5b h5bVar = new h5b();
                h5bVar.setArguments(aq1.a(new Pair("passport_is_continue_with_google", Boolean.FALSE)));
                h5bVar.z0 = function1;
                h5bVar.L(lr5Var, "PassportSignInWebViewFragment");
                aVar.h(false);
                return j6g.a;
            case 7:
                return new gt8((ikd) obj3, bs4.a, (ekd) obj2);
            case 8:
                ((Function1) obj3).invoke(new cl6(2, (gu5) obj2));
                qa9.b(ca9.a, "");
                return j6g.a;
            case DatadogLogGenerator.CRASH /* 9 */:
                String str = (String) obj2;
                if (!((huc) obj3).element) {
                    try {
                        com.indeed.android.uiplugin.oneoff.a aVar2 = com.indeed.android.uiplugin.oneoff.a.a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        JsonPrimitive jsonPrimitiveC = la8.c("cancel");
                        jsonPrimitiveC.getClass();
                        j6g j6gVar = j6g.a;
                        aVar2.b(str, new JsonObject(linkedHashMap));
                        ArrayList arrayList = lz2.a;
                        Log.d("RNOnboardingBottomSheetFragmentUtils", "Triggered onboarding callback with cancel result on detach: ".concat(str), null);
                    } catch (JSONCallbackError.CallbackNotFound unused2) {
                        ArrayList arrayList2 = lz2.a;
                        Log.d("RNOnboardingBottomSheetFragmentUtils", "Onboarding callback was already triggered: ".concat(str), null);
                    } catch (JSONCallbackError e2) {
                        ArrayList arrayList3 = lz2.a;
                        lz2.h("RNOnboardingBottomSheetFragmentUtils", "Failed to trigger onboarding callback on detach: " + e2.getMessage(), null, 12);
                    }
                    break;
                }
                try {
                    com.indeed.android.uiplugin.oneoff.a aVar3 = com.indeed.android.uiplugin.oneoff.a.a;
                } catch (Exception e3) {
                    ArrayList arrayList4 = lz2.a;
                    lz2.h("RNOnboardingBottomSheetFragmentUtils", "Failed to remove onboarding callback: " + e3.getMessage(), null, 12);
                }
                if (str.length() == 0) {
                    throw new JSONCallbackError.InvalidCallbackId(str);
                }
                com.indeed.android.uiplugin.oneoff.a.b.remove(str);
                ArrayList arrayList5 = lz2.a;
                Log.d("RNOnboardingBottomSheetFragmentUtils", "Removed onboarding callback: ".concat(str), null);
                return j6g.a;
            case 10:
                i1g i1gVar = (i1g) cr8.p(i1g.class);
                lr5 lr5VarU = ((d9d) obj3).requireActivity().u();
                lr5VarU.getClass();
                i1gVar.a(lr5VarU, (w0g) ((gu5) obj2).invoke());
                return j6g.a;
            case 11:
                ((Function1) obj3).invoke(lcf.c);
                ((Function1) obj2).invoke(new jhf("", 0L, 6));
                return j6g.a;
            case 12:
                gu5 gu5Var = (gu5) obj2;
                b4g.q((String) obj3, "LogoButton");
                if (gu5Var != null) {
                    gu5Var.invoke();
                }
                return j6g.a;
            default:
                igg iggVar = (igg) obj3;
                String str2 = (String) obj2;
                iggVar.close();
                Function2<? super ps7, ? super ss7, j6g> function2 = iggVar.i0;
                if (function2 != null) {
                    function2.invoke(iggVar.j0 ? ps7.a : ps7.b, new ss7(str2));
                }
                return j6g.a;
        }
    }

    public /* synthetic */ ti(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}

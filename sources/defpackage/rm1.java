package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.webkit.URLUtil;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.a;
import androidx.navigation.e;
import com.indeed.android.jobsearch.BuildConfig;
import com.indeed.android.jobsearch.LaunchActivity;
import com.indeed.android.jobsearch.webview.indeedapply.IndeedApplyWebViewFragment;
import com.indeed.android.jsmappservices.bridge.AceNewConversationCommand;
import com.indeed.android.jsmappservices.bridge.AceNewConversationData;
import com.indeed.android.jsmappservices.bridge.AceOpenConversationWithIdCommand;
import com.indeed.android.jsmappservices.bridge.AceOpenConversationWithIdData;
import com.indeed.android.jsmappservices.bridge.ActionOverflowCommand;
import com.indeed.android.jsmappservices.bridge.ActionOverflowData;
import com.indeed.android.jsmappservices.bridge.AppConsoleLog;
import com.indeed.android.jsmappservices.bridge.BridgeDispatcher;
import com.indeed.android.jsmappservices.bridge.CallPhoneNumberCommand;
import com.indeed.android.jsmappservices.bridge.CanShowPushPromptCommand;
import com.indeed.android.jsmappservices.bridge.Command;
import com.indeed.android.jsmappservices.bridge.DismissApplyWebView;
import com.indeed.android.jsmappservices.bridge.DismissModalWithWebView;
import com.indeed.android.jsmappservices.bridge.DismissModalWithWebViewData;
import com.indeed.android.jsmappservices.bridge.DisplayToastCommand;
import com.indeed.android.jsmappservices.bridge.GetAvailableMethodsCommand;
import com.indeed.android.jsmappservices.bridge.GetCachedValueCommand;
import com.indeed.android.jsmappservices.bridge.GetNativeAppInfoCommand;
import com.indeed.android.jsmappservices.bridge.GetPushAuthorizationStatusCommand;
import com.indeed.android.jsmappservices.bridge.IncrementPushSignificantEventCommand;
import com.indeed.android.jsmappservices.bridge.IndeedApplyDidCompleteCommand;
import com.indeed.android.jsmappservices.bridge.IndeedApplyDidCompleteData;
import com.indeed.android.jsmappservices.bridge.IsGeolocationGrantedCommand;
import com.indeed.android.jsmappservices.bridge.MarkHomePageReadyCommand;
import com.indeed.android.jsmappservices.bridge.NavigateToInterviewPrepCommand;
import com.indeed.android.jsmappservices.bridge.NavigateToInterviewPrepCommandData;
import com.indeed.android.jsmappservices.bridge.NavigateToLogin;
import com.indeed.android.jsmappservices.bridge.NavigateToResumeCoachCommand;
import com.indeed.android.jsmappservices.bridge.NavigateToResumeCoachCommandData;
import com.indeed.android.jsmappservices.bridge.OpenAndroidAppInfoCommand;
import com.indeed.android.jsmappservices.bridge.OpenOnboardingModalCommand;
import com.indeed.android.jsmappservices.bridge.OpenOnboardingModalData;
import com.indeed.android.jsmappservices.bridge.OpenPushNotificationAuthorizationSettingsCommand;
import com.indeed.android.jsmappservices.bridge.PushModalConfigData;
import com.indeed.android.jsmappservices.bridge.RegisterViewJobNavBarSaveButtonClickHandler;
import com.indeed.android.jsmappservices.bridge.RequestImmediateSystemPushAuthorizationCommand;
import com.indeed.android.jsmappservices.bridge.RequestPushReengagementModalCommand;
import com.indeed.android.jsmappservices.bridge.RequestSystemPushAuthWithPrimerCommand;
import com.indeed.android.jsmappservices.bridge.ResetPushPromptCooldownTimeoutCommand;
import com.indeed.android.jsmappservices.bridge.SetCachedValueCommand;
import com.indeed.android.jsmappservices.bridge.SetViewJobNavBarSaveButtonStateCommand;
import com.indeed.android.jsmappservices.bridge.ShareContentCommand;
import com.indeed.android.jsmappservices.bridge.ShareContentData;
import com.indeed.android.jsmappservices.bridge.ShareDiagnosticsCommand;
import com.indeed.android.jsmappservices.bridge.ShowModalWithWebView;
import com.indeed.android.jsmappservices.bridge.ShowModalWithWebViewAndWaitForResult;
import com.indeed.android.jsmappservices.bridge.ShowModalWithWebviewData;
import com.indeed.android.jsmappservices.bridge.ShowSearchOverlayCommand;
import com.indeed.android.jsmappservices.bridge.StartIndeedApplyCommand;
import com.indeed.android.jsmappservices.bridge.ViewJobHintData;
import com.indeed.android.jsmappservices.bridge.WebOnboardingOnComplete;
import com.indeed.android.jsmappservices.bridge.results.BooleanResult;
import com.indeed.android.jsmappservices.bridge.results.CanShowPushPromptResult;
import com.indeed.android.jsmappservices.bridge.results.GetAvailableMethodsResult;
import com.indeed.android.jsmappservices.bridge.results.GetNativeAppInfoResult;
import com.indeed.android.jsmappservices.bridge.results.PushAuthStatusResult;
import com.indeed.android.jsmappservices.bridge.results.PushReengagementResult;
import com.indeed.android.jsmappservices.bridge.results.ShowSearchOverlayResult;
import com.indeed.android.jsmappservices.bridge.results.ViewJobHintResult;
import com.indeed.android.jsmappservices.components.hybridactionoverflow.HybridActionOverflowArgs;
import com.indeed.android.jsmappservices.components.hybridactionoverflow.HybridActionOverflowRow;
import com.indeed.android.jsmappservices.util.LocationSensor;
import com.indeed.android.reactnative.rntarebridge.RNTareBridgeDetachmentException;
import com.indeed.android.tare.management.JSTCacheValue;
import com.indeed.android.tare.management.ViewJobHint;
import defpackage.cd4;
import defpackage.ide;
import defpackage.jq7;
import defpackage.rwg;
import defpackage.s87;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import kotlinx.serialization.json.internal.JsonDecodingException;

/* JADX INFO: loaded from: classes2.dex */
public final class rm1 {
    public static final void a(LaunchActivity launchActivity, Command command, BridgeDispatcher.c cVar, Function1 function1, Function1 function12, Function1 function13) {
        String str;
        AceNewConversationData b;
        String str2;
        lr5 lr5VarU;
        Fragment fragment;
        e eVarK;
        AceOpenConversationWithIdData b2;
        String str3;
        lr5 lr5VarU2;
        Fragment fragment2;
        e eVarK2;
        String str4;
        Fragment fragment3;
        e eVarK3;
        String str5;
        Fragment fragment4;
        e eVarK4;
        launchActivity.getClass();
        tx5 tx5Var = launchActivity.v0;
        command.getClass();
        if (command instanceof ShareContentCommand) {
            ShareContentData b3 = ((ShareContentCommand) command).getB();
            if (b3.b == null) {
                ArrayList arrayList = lz2.a;
                lz2.c("BridgeCommandHandler", "@@shareContent: url is null", false, null, 12);
                return;
            }
            ide.a aVar = new ide.a(launchActivity);
            Intent intent = aVar.b;
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.TEXT", (CharSequence) b3.b);
            String str6 = b3.a;
            if (str6 != null) {
                intent.putExtra("android.intent.extra.SUBJECT", str6);
            }
            aVar.a();
            j6g j6gVar = j6g.a;
            return;
        }
        int i = 4;
        if (command instanceof ActionOverflowCommand) {
            ActionOverflowCommand actionOverflowCommand = (ActionOverflowCommand) command;
            if (actionOverflowCommand.getB().d.isEmpty()) {
                ArrayList arrayList2 = lz2.a;
                lz2.c("BridgeCommandHandler", "@@ActionOverflow items null or empty", false, null, 12);
                return;
            }
            if (launchActivity.u().O()) {
                ArrayList arrayList3 = lz2.a;
                lz2.c("BridgeCommandHandler", "About to show hybrid bottom sheet fragment but fragment state has been saved", false, new Exception(), 4);
            } else {
                lr5 lr5VarU3 = launchActivity.u();
                lr5VarU3.getClass();
                String a = actionOverflowCommand.getB().getA();
                String b4 = actionOverflowCommand.getB().getB();
                String c = actionOverflowCommand.getB().getC();
                List<ActionOverflowData.ActionOverflowRow> list = actionOverflowCommand.getB().d;
                ArrayList arrayList4 = new ArrayList(t92.r0(list, 10));
                for (ActionOverflowData.ActionOverflowRow actionOverflowRow : list) {
                    arrayList4.add(new HybridActionOverflowRow(actionOverflowRow.getA(), actionOverflowRow.getB(), actionOverflowRow.getC()));
                }
                Integer e = actionOverflowCommand.getB().getE();
                yh yhVar = new yh(cVar, 3);
                pm6 pm6Var = new pm6();
                pm6Var.l0 = yhVar;
                pm6Var.setArguments(aq1.a(new Pair("hybrid_action_overflow_args", new HybridActionOverflowArgs(a, b4, c, arrayList4, e))));
                pm6Var.L(lr5VarU3, "HybridActionOverflowFragment");
            }
            j6g j6gVar2 = j6g.a;
            return;
        }
        if (command instanceof ShareDiagnosticsCommand) {
            String a2 = ((ShareDiagnosticsCommand) command).getB().getA();
            if (a2 == null) {
                a2 = "none";
            }
            u63.Y(hh1.A(launchActivity), null, null, new pm1(launchActivity, a2, function13, launchActivity, null), 3);
            return;
        }
        if (command instanceof StartIndeedApplyCommand) {
            String a3 = ((StartIndeedApplyCommand) command).getB().getA();
            if (!URLUtil.isValidUrl(a3)) {
                cVar.d("ERR_INVALID_ARGS");
                return;
            }
            String queryParameter = Uri.parse(a3).getQueryParameter("continueUrl");
            lr5 lr5VarU4 = launchActivity.u();
            lr5VarU4.getClass();
            fy fyVar = new fy(cVar, 3);
            qj qjVar = new qj(i, cVar, queryParameter);
            a3.getClass();
            IndeedApplyWebViewFragment indeedApplyWebViewFragment = new IndeedApplyWebViewFragment();
            Bundle bundle = new Bundle();
            bundle.putString("KEY_APPLY_URL", a3);
            indeedApplyWebViewFragment.setArguments(bundle);
            indeedApplyWebViewFragment.G0 = fyVar;
            indeedApplyWebViewFragment.H0 = qjVar;
            indeedApplyWebViewFragment.L(lr5VarU4, "IndeedApplyWebViewFragment");
            j6g j6gVar3 = j6g.a;
            return;
        }
        if (command instanceof IndeedApplyDidCompleteCommand) {
            bu8 bu8Var = bu8.a;
            bu8Var.getClass();
            z zVar = bu8.g0;
            qf8<Object>[] qf8VarArr = bu8.b;
            int iIntValue = ((Number) zVar.d(qf8VarArr[16], bu8Var)).intValue();
            int iC = bu8Var.c();
            zVar.e(qf8VarArr[16], bu8Var, Integer.valueOf(iIntValue + 1));
            bu8Var.j(iIntValue == 0 ? iC + 20 : iC + 5);
            IndeedApplyDidCompleteData b5 = ((IndeedApplyDidCompleteCommand) command).getB();
            Lazy<s87> lazy = s87.f;
            gz4 gz4VarD = launchActivity.D();
            String str7 = b5.a;
            String str8 = b5.c;
            String str9 = b5.b;
            s87.a.a(gz4VarD, tx5Var.m(str7, str9, str8));
            nhb nhbVar = new nhb(b5.a, str9, str8);
            function1.invoke(nhbVar);
            launchActivity.J(nhbVar);
            j6g j6gVar4 = j6g.a;
            return;
        }
        if (command instanceof GetAvailableMethodsCommand) {
            ic2[] ic2VarArrValues = ic2.values();
            ArrayList arrayList5 = new ArrayList(ic2VarArrValues.length);
            for (ic2 ic2Var : ic2VarArrValues) {
                arrayList5.add(ic2Var.a());
            }
            cVar.a(new GetAvailableMethodsResult(arrayList5));
            j6g j6gVar5 = j6g.a;
            return;
        }
        if (command instanceof GetNativeAppInfoCommand) {
            Build.VERSION.RELEASE.getClass();
            Locale locale = Locale.ROOT;
            locale.getClass();
            String upperCase = BuildConfig.FLAVOR.toUpperCase(locale);
            upperCase.getClass();
            String upperCase2 = "release".toUpperCase(locale);
            upperCase2.getClass();
            cVar.a(new GetNativeAppInfoResult(upperCase, upperCase2, (String) b97.a.getValue(), ((s9e) launchActivity.q0.getValue()).a()));
            j6g j6gVar6 = j6g.a;
            return;
        }
        if (command instanceof CallPhoneNumberCommand) {
            launchActivity.getO0().a(cVar, ((CallPhoneNumberCommand) command).getB().getA());
            j6g j6gVar7 = j6g.a;
            return;
        }
        if (command instanceof DisplayToastCommand) {
            function13.invoke(((DisplayToastCommand) command).getB());
            j6g j6gVar8 = j6g.a;
            return;
        }
        if (command instanceof ShowSearchOverlayCommand) {
            try {
                function12.invoke(((ShowSearchOverlayCommand) command).b);
                cVar.a(new ShowSearchOverlayResult(((ShowSearchOverlayCommand) command).b.getA()));
            } catch (Exception e2) {
                ArrayList arrayList6 = lz2.a;
                lz2.c("BridgeCommandHandler", "@@ShowSearchOverlayCommand: operation failed.", false, null, 12);
                cVar.d("Error opening search overlay: " + e2.getMessage());
            }
            j6g j6gVar9 = j6g.a;
            return;
        }
        if (command instanceof IsGeolocationGrantedCommand) {
            cVar.a(new BooleanResult(((LocationSensor) launchActivity.x0.getValue()).c()));
            j6g j6gVar10 = j6g.a;
            return;
        }
        if (command instanceof OpenAndroidAppInfoCommand) {
            try {
                launchActivity.startActivity(new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.fromParts("package", launchActivity.getPackageName(), null)).addFlags(32768).addFlags(268435456));
            } catch (ActivityNotFoundException unused) {
                ArrayList arrayList7 = lz2.a;
                lz2.c("BridgeCommandHandler", "@@OpenAndroidAppInfoCommand: activity not found.", false, null, 12);
                cVar.d("Activity not found.");
            } catch (Exception unused2) {
                ArrayList arrayList8 = lz2.a;
                lz2.c("BridgeCommandHandler", "@@OpenAndroidAppInfoCommand: operation failed.", false, null, 12);
                cVar.d("Operation failed.");
            }
            j6g j6gVar11 = j6g.a;
            return;
        }
        if (command instanceof ShowModalWithWebView) {
            ShowModalWithWebviewData b6 = ((ShowModalWithWebView) command).getB();
            lr5 lr5VarU5 = launchActivity.u();
            lr5VarU5.getClass();
            b6.getClass();
            int i2 = rwg.u0;
            rwg.a.a(b6, null).K(new a(lr5VarU5), "WebViewBottomSheetModalFragment");
            cVar.c();
            j6g j6gVar12 = j6g.a;
            return;
        }
        if (command instanceof ShowModalWithWebViewAndWaitForResult) {
            ShowModalWithWebviewData b7 = ((ShowModalWithWebViewAndWaitForResult) command).getB();
            lr5 lr5VarU6 = launchActivity.u();
            lr5VarU6.getClass();
            b7.getClass();
            int i3 = rwg.u0;
            rwg.a.a(b7, cVar).K(new a(lr5VarU6), "WebViewBottomSheetModalFragment");
            j6g j6gVar13 = j6g.a;
            return;
        }
        if (command instanceof DismissModalWithWebView) {
            DismissModalWithWebViewData b8 = ((DismissModalWithWebView) command).getB();
            lr5 lr5VarU7 = launchActivity.u();
            lr5VarU7.getClass();
            b8.getClass();
            Fragment fragmentD = lr5VarU7.D("WebViewBottomSheetModalFragment");
            if (fragmentD != null) {
                ec1 ec1Var = (ec1) fragmentD;
                ec1Var.r0 = b8.a;
                ec1Var.E();
            }
            cVar.c();
            j6g j6gVar14 = j6g.a;
            return;
        }
        str = "";
        if (command instanceof AppConsoleLog) {
            ArrayList arrayList9 = lz2.a;
            String a4 = ((AppConsoleLog) command).getB().getA();
            lz2.d("[JSConsoleLog]", a4 != null ? a4 : "", false, null);
            j6g j6gVar15 = j6g.a;
            return;
        }
        if (command instanceof DismissApplyWebView) {
            lr5 lr5VarU8 = launchActivity.u();
            lr5VarU8.getClass();
            Fragment fragmentD2 = lr5VarU8.D("IndeedApplyWebViewFragment");
            if (fragmentD2 != null) {
                ((IndeedApplyWebViewFragment) fragmentD2).E();
            }
            j6g j6gVar16 = j6g.a;
            return;
        }
        if (command instanceof SetViewJobNavBarSaveButtonStateCommand) {
            boolean a5 = ((SetViewJobNavBarSaveButtonStateCommand) command).getB().getA();
            g3a<jz2<j6g>> g3aVar = kqg.a;
            lr5 lr5VarU9 = launchActivity.u();
            lr5VarU9.getClass();
            kqg.d(a5, lr5VarU9);
            j6g j6gVar17 = j6g.a;
            return;
        }
        if (command instanceof RegisterViewJobNavBarSaveButtonClickHandler) {
            String a6 = ((RegisterViewJobNavBarSaveButtonClickHandler) command).getB().getA();
            g3a<jz2<j6g>> g3aVar2 = kqg.a;
            lr5 lr5VarU10 = launchActivity.u();
            lr5VarU10.getClass();
            if (kqg.c(a6, lr5VarU10)) {
                cVar.a(new BooleanResult(true));
            } else {
                cVar.d("Failed to register handler for ".concat(a6));
            }
            j6g j6gVar18 = j6g.a;
            return;
        }
        if (command instanceof WebOnboardingOnComplete) {
            nde ndeVar = qra.a;
            qra.a(((WebOnboardingOnComplete) command).getB().getA());
            j6g j6gVar19 = j6g.a;
            return;
        }
        if (command instanceof GetCachedValueCommand) {
            String a7 = ((GetCachedValueCommand) command).getB().getA();
            JSTCacheValue jSTCacheValueA = ((ep7) cr8.p(ep7.class)).d().a(a7);
            if (jSTCacheValueA == null) {
                cVar.c();
            } else if (jSTCacheValueA instanceof ViewJobHint) {
                ViewJobHint viewJobHint = (ViewJobHint) jSTCacheValueA;
                cVar.a(new ViewJobHintResult(viewJobHint.getA(), viewJobHint.getB(), viewJobHint.getC(), viewJobHint.getD(), viewJobHint.getE(), viewJobHint.getF()));
            } else {
                String strConcat = "cachedValue is not of type ViewJobHint for key: ".concat(a7);
                ArrayList arrayList10 = lz2.a;
                lz2.b("BridgeCommandHandler", strConcat, false, new Exception(strConcat));
                cVar.c();
            }
            j6g j6gVar20 = j6g.a;
            return;
        }
        if (command instanceof SetCachedValueCommand) {
            try {
                ViewJobHintData b9 = ((SetCachedValueCommand) command).b.getB();
                ((ep7) cr8.p(ep7.class)).d().b(((SetCachedValueCommand) command).b.getA(), new ViewJobHint(b9.getA(), b9.getB(), b9.getC(), b9.getD(), b9.getE(), b9.getF()));
                cVar.c();
            } catch (Exception e3) {
                ArrayList arrayList11 = lz2.a;
                lz2.b("BridgeCommandHandler", "@@SetCachedValueCommand: operation failed.", false, e3);
                cVar.d("Error setting cached value: " + e3.getMessage());
            }
            j6g j6gVar21 = j6g.a;
            return;
        }
        if (command instanceof NavigateToLogin) {
            ((NavigateToLogin) command).getB().getClass();
            try {
                rq7 rq7Var = (rq7) cr8.p(rq7.class);
                lr5 lr5VarU11 = launchActivity.u();
                lr5VarU11.getClass();
                rq7Var.b(lr5VarU11, new a3(cVar, 6));
            } catch (Exception e4) {
                ArrayList arrayList12 = lz2.a;
                lz2.b("BridgeCommandHandler", "@@NavigateToLogin: operation failed.", false, e4);
                cVar.d("Error navigating to login url: " + e4.getMessage());
            }
            j6g j6gVar22 = j6g.a;
            return;
        }
        if (command instanceof AceNewConversationCommand) {
            try {
                b = ((AceNewConversationCommand) command).getB();
                String c2 = b.getC();
                str2 = zve.U(c2) ? null : c2;
                if (str2 == null) {
                    str2 = "bridge_command";
                }
                lr5VarU = launchActivity.u();
                lr5VarU.getClass();
                List<Fragment> listF = lr5VarU.c.f();
                listF.getClass();
                fragment = (Fragment) z92.Q0(listF);
            } catch (Exception e5) {
                ArrayList arrayList13 = lz2.a;
                lz2.b("BridgeCommandHandler", "@@AceNewConversation: operation failed.", false, e5);
                cVar.d("Error starting new ACE conversation: " + e5.getMessage());
            }
            if (fragment == null || (eVarK = mh2.k(fragment)) == null) {
                throw new RNTareBridgeDetachmentException();
            }
            rq7 rq7Var2 = (rq7) cr8.p(rq7.class);
            String a8 = b.getA();
            if (a8 != null) {
                str = a8;
            }
            rq7Var2.f(lr5VarU, eVarK, new jq7.c(str, b.getB(), i), str2);
            Lazy<s87> lazy2 = s87.f;
            gz4 gz4VarD2 = launchActivity.D();
            List listZ = u63.Z("coWorker");
            mm1 mm1Var = new mm1(0, str2, b);
            tx5Var.getClass();
            s87.a.a(gz4VarD2, new lx5("ace_navigation", "navigation", "aceNewConversationNavigation", 1, listZ, new qx5(mm1Var)));
            cVar.c();
            j6g j6gVar23 = j6g.a;
            return;
        }
        if (command instanceof AceOpenConversationWithIdCommand) {
            try {
                b2 = ((AceOpenConversationWithIdCommand) command).getB();
                String d = b2.getD();
                str3 = zve.U(d) ? null : d;
                if (str3 == null) {
                    str3 = "bridge_command";
                }
                lr5VarU2 = launchActivity.u();
                lr5VarU2.getClass();
                List<Fragment> listF2 = lr5VarU2.c.f();
                listF2.getClass();
                fragment2 = (Fragment) z92.Q0(listF2);
            } catch (Exception e6) {
                ArrayList arrayList14 = lz2.a;
                lz2.b("BridgeCommandHandler", "@@AceOpenConversationWithId: operation failed.", false, e6);
                cVar.d("Error opening ACE conversation: " + e6.getMessage());
            }
            if (fragment2 == null || (eVarK2 = mh2.k(fragment2)) == null) {
                throw new RNTareBridgeDetachmentException();
            }
            ((rq7) cr8.p(rq7.class)).f(lr5VarU2, eVarK2, new jq7.b(b2.getA(), b2.getB(), b2.getC()), str3);
            Lazy<s87> lazy3 = s87.f;
            gz4 gz4VarD3 = launchActivity.D();
            List listZ2 = u63.Z("coWorker");
            nm1 nm1Var = new nm1(0, b2, str3);
            tx5Var.getClass();
            s87.a.a(gz4VarD3, new lx5("ace_navigation", "navigation", "aceOpenConversationWithIdNavigation", 1, listZ2, new qx5(nm1Var)));
            cVar.c();
            j6g j6gVar24 = j6g.a;
            return;
        }
        if (command instanceof MarkHomePageReadyCommand) {
            dd4 dd4Var = dd4.a;
            ad4 ad4Var = dd4.n().a;
            ad4Var.getClass();
            if (ad4Var.e(cd4.a.C1) == cd4.l0.a.getValue()) {
                ((t1g) cr8.p(t1g.class)).e();
                ((t1g) cr8.p(t1g.class)).b();
            }
            j6g j6gVar25 = j6g.a;
            return;
        }
        if (command instanceof OpenOnboardingModalCommand) {
            try {
                OpenOnboardingModalData b10 = ((OpenOnboardingModalCommand) command).getB();
                String a9 = b10.getA();
                Map<String, JsonElement> mapA = b10.a();
                ArrayList arrayList15 = new ArrayList();
                for (Map.Entry<String, JsonElement> entry : mapA.entrySet()) {
                    String key = entry.getKey();
                    Serializable serializableB = b(entry.getValue());
                    Pair pairM = serializableB != null ? beb.m(key, serializableB) : null;
                    if (pairM != null) {
                        arrayList15.add(pairM);
                    }
                }
                er7 er7Var = new er7(a9, lc9.f0(arrayList15), b10.getC());
                rq7 rq7Var3 = (rq7) cr8.p(rq7.class);
                lr5 lr5VarU12 = launchActivity.u();
                lr5VarU12.getClass();
                rq7Var3.a(er7Var, lr5VarU12, b10.getE(), b10.getD(), new tv(cVar, 3));
            } catch (Exception e7) {
                ArrayList arrayList16 = lz2.a;
                lz2.b("BridgeCommandHandler", "@@OpenOnboardingModal: operation failed.", false, e7);
                cVar.d("Error opening onboarding modal: " + e7.getMessage());
            }
            j6g j6gVar26 = j6g.a;
            return;
        }
        int i4 = 2;
        if (command instanceof NavigateToInterviewPrepCommand) {
            try {
                NavigateToInterviewPrepCommandData b11 = ((NavigateToInterviewPrepCommand) command).getB();
                lr5 lr5VarU13 = launchActivity.u();
                lr5VarU13.getClass();
                String c3 = b11.getC();
                if (c3 != null) {
                    str4 = zve.U(c3) ? null : c3;
                    if (str4 == null) {
                        str4 = "bridge_command";
                    }
                    List<Fragment> listF3 = lr5VarU13.c.f();
                    listF3.getClass();
                    fragment3 = (Fragment) z92.Q0(listF3);
                    if (fragment3 != null) {
                    }
                    throw new RNTareBridgeDetachmentException();
                }
                str4 = "bridge_command";
                List<Fragment> listF32 = lr5VarU13.c.f();
                listF32.getClass();
                fragment3 = (Fragment) z92.Q0(listF32);
                if (fragment3 != null || (eVarK3 = mh2.k(fragment3)) == null) {
                    throw new RNTareBridgeDetachmentException();
                }
                ((rq7) cr8.p(rq7.class)).f(lr5VarU13, eVarK3, new jq7.l(b11.getA(), new hq7(b11.getB(), 2), i4), str4);
                Lazy<s87> lazy4 = s87.f;
                gz4 gz4VarD4 = launchActivity.D();
                List listZ3 = u63.Z("interviewPrep");
                qs0 qs0Var = new qs0(1, b11, str4);
                tx5Var.getClass();
                s87.a.a(gz4VarD4, tx5.n(listZ3, qs0Var));
                cVar.c();
            } catch (Exception e8) {
                ArrayList arrayList17 = lz2.a;
                lz2.b("BridgeCommandHandler", "@@NavigateToInterviewPrep: operation failed.", false, e8);
                cVar.d("Error opening Interview Prep: " + e8.getMessage());
            }
            j6g j6gVar27 = j6g.a;
            return;
        }
        if (command instanceof NavigateToResumeCoachCommand) {
            try {
                NavigateToResumeCoachCommandData b12 = ((NavigateToResumeCoachCommand) command).getB();
                lr5 lr5VarU14 = launchActivity.u();
                lr5VarU14.getClass();
                String a10 = b12.getA();
                if (a10 != null) {
                    str5 = zve.U(a10) ? null : a10;
                    if (str5 == null) {
                        str5 = "bridge_command";
                    }
                    List<Fragment> listF4 = lr5VarU14.c.f();
                    listF4.getClass();
                    fragment4 = (Fragment) z92.Q0(listF4);
                    if (fragment4 != null) {
                    }
                    throw new RNTareBridgeDetachmentException();
                }
                str5 = "bridge_command";
                List<Fragment> listF42 = lr5VarU14.c.f();
                listF42.getClass();
                fragment4 = (Fragment) z92.Q0(listF42);
                if (fragment4 != null || (eVarK4 = mh2.k(fragment4)) == null) {
                    throw new RNTareBridgeDetachmentException();
                }
                ((rq7) cr8.p(rq7.class)).f(lr5VarU14, eVarK4, jq7.y.INSTANCE, str5);
                cVar.c();
            } catch (Exception e9) {
                ArrayList arrayList18 = lz2.a;
                lz2.b("BridgeCommandHandler", "@@NavigateToResumeCoach: operation failed.", false, e9);
                cVar.d("Error opening Resume Coach: " + e9.getMessage());
            }
            j6g j6gVar28 = j6g.a;
            return;
        }
        if (command instanceof CanShowPushPromptCommand) {
            try {
                cVar.a(new CanShowPushPromptResult(d(((at7) cr8.p(at7.class)).a()), ((at7) cr8.p(at7.class)).h()));
            } catch (Exception e10) {
                ArrayList arrayList19 = lz2.a;
                lz2.b("BridgeCommandHandler", "@@canShowPushPrompt: " + e10.getMessage(), false, e10);
                String message = e10.getMessage();
                if (message == null) {
                    message = "canShowPushPrompt failed";
                }
                cVar.d(message);
            }
            j6g j6gVar29 = j6g.a;
            return;
        }
        if (command instanceof GetPushAuthorizationStatusCommand) {
            try {
                cVar.a(new PushAuthStatusResult(d(((at7) cr8.p(at7.class)).a())));
            } catch (Exception e11) {
                ArrayList arrayList20 = lz2.a;
                lz2.b("BridgeCommandHandler", "@@getPushAuthorizationStatus: " + e11.getMessage(), false, e11);
                String message2 = e11.getMessage();
                if (message2 == null) {
                    message2 = "getPushAuthorizationStatus failed";
                }
                cVar.d(message2);
            }
            j6g j6gVar30 = j6g.a;
            return;
        }
        boolean z = command instanceof RequestSystemPushAuthWithPrimerCommand;
        ft7 ft7Var = ft7.c;
        if (z) {
            if (Build.VERSION.SDK_INT < 33) {
                cVar.a(new PushAuthStatusResult(d(ft7Var)));
                return;
            }
            try {
                ht7 ht7VarF = f(((RequestSystemPushAuthWithPrimerCommand) command).b.a);
                PushModalConfigData pushModalConfigData = ((RequestSystemPushAuthWithPrimerCommand) command).b.c;
                ((at7) cr8.p(at7.class)).g(pushModalConfigData != null ? e(pushModalConfigData) : null, ht7VarF, ((RequestSystemPushAuthWithPrimerCommand) command).b.b, new cu(cVar, 2));
            } catch (Exception e12) {
                ArrayList arrayList21 = lz2.a;
                lz2.b("BridgeCommandHandler", "@@requestSystemPushAuthWithPrimer: " + e12.getMessage(), false, e12);
                String message3 = e12.getMessage();
                if (message3 == null) {
                    message3 = "requestSystemPushAuthWithPrimer failed";
                }
                cVar.d(message3);
            }
            j6g j6gVar31 = j6g.a;
            return;
        }
        if (command instanceof RequestPushReengagementModalCommand) {
            if (Build.VERSION.SDK_INT < 33) {
                cVar.a(new PushReengagementResult(c(zs7.a)));
                return;
            }
            try {
                ht7 ht7VarF2 = f(((RequestPushReengagementModalCommand) command).b.a);
                PushModalConfigData pushModalConfigData2 = ((RequestPushReengagementModalCommand) command).b.c;
                ((at7) cr8.p(at7.class)).f(pushModalConfigData2 != null ? e(pushModalConfigData2) : null, ht7VarF2, ((RequestPushReengagementModalCommand) command).b.b, new vx0(cVar, 2));
            } catch (Exception e13) {
                ArrayList arrayList22 = lz2.a;
                lz2.b("BridgeCommandHandler", "@@requestPushReengagementModal: " + e13.getMessage(), false, e13);
                String message4 = e13.getMessage();
                if (message4 == null) {
                    message4 = "requestPushReengagementModal failed";
                }
                cVar.d(message4);
            }
            j6g j6gVar32 = j6g.a;
            return;
        }
        if (command instanceof RequestImmediateSystemPushAuthorizationCommand) {
            if (Build.VERSION.SDK_INT < 33) {
                cVar.a(new PushAuthStatusResult(d(ft7Var)));
                return;
            }
            try {
                at7 at7Var = (at7) cr8.p(at7.class);
                ((RequestImmediateSystemPushAuthorizationCommand) command).getB().getClass();
                at7Var.e(new se(cVar, 6));
            } catch (Exception e14) {
                ArrayList arrayList23 = lz2.a;
                lz2.b("BridgeCommandHandler", "@@requestImmediateSystemPushAuthorization: " + e14.getMessage(), false, e14);
                String message5 = e14.getMessage();
                if (message5 == null) {
                    message5 = "requestImmediateSystemPushAuthorization failed";
                }
                cVar.d(message5);
            }
            j6g j6gVar33 = j6g.a;
            return;
        }
        if (command instanceof OpenPushNotificationAuthorizationSettingsCommand) {
            try {
                ((at7) cr8.p(at7.class)).c(new q2(cVar, 6));
            } catch (Exception e15) {
                ArrayList arrayList24 = lz2.a;
                lz2.b("BridgeCommandHandler", "@@openPushNotificationAuthorizationSettings: " + e15.getMessage(), false, e15);
                String message6 = e15.getMessage();
                if (message6 == null) {
                    message6 = "openPushNotificationAuthorizationSettings failed";
                }
                cVar.d(message6);
            }
            j6g j6gVar34 = j6g.a;
            return;
        }
        if (!(command instanceof ResetPushPromptCooldownTimeoutCommand)) {
            if (!(command instanceof IncrementPushSignificantEventCommand)) {
                l.g();
                return;
            }
            ArrayList arrayList25 = lz2.a;
            lz2.h("BridgeCommandHandler", "incrementPushSignificantEvent not used on Android", null, 12);
            cVar.c();
            j6g j6gVar35 = j6g.a;
            return;
        }
        try {
            ((at7) cr8.p(at7.class)).b();
            cVar.c();
        } catch (Exception e16) {
            ArrayList arrayList26 = lz2.a;
            lz2.b("BridgeCommandHandler", "@@resetPushPromptCooldownTimeout: " + e16.getMessage(), false, e16);
            String message7 = e16.getMessage();
            if (message7 == null) {
                message7 = "resetPushPromptCooldownTimeout failed";
            }
            cVar.d(message7);
        }
        j6g j6gVar36 = j6g.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Serializable b(JsonElement jsonElement) {
        jsonElement.getClass();
        if (jsonElement.equals(JsonNull.INSTANCE)) {
            return null;
        }
        if (!(jsonElement instanceof JsonPrimitive)) {
            if (jsonElement instanceof JsonObject) {
                Map map = (Map) jsonElement;
                LinkedHashMap linkedHashMap = new LinkedHashMap(kc9.V(map.size()));
                for (Map.Entry entry : map.entrySet()) {
                    linkedHashMap.put(entry.getKey(), b((JsonElement) entry.getValue()));
                }
                return linkedHashMap;
            }
            if (!(jsonElement instanceof JsonArray)) {
                l.g();
                return null;
            }
            Iterable iterable = (Iterable) jsonElement;
            ArrayList arrayList = new ArrayList(t92.r0(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(b((JsonElement) it.next()));
            }
            return arrayList;
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElement;
        if (jsonPrimitive.b()) {
            return jsonPrimitive.a();
        }
        wd7 wd7Var = la8.a;
        if (jve.b(jsonPrimitive.a()) != null) {
            Boolean boolB = jve.b(jsonPrimitive.a());
            if (boolB != null) {
                return boolB;
            }
            throw new IllegalStateException(jsonPrimitive + " does not represent a Boolean");
        }
        if (la8.e(jsonPrimitive) == null) {
            if (la8.h(jsonPrimitive) == null) {
                return vve.A(jsonPrimitive.a()) != null ? Double.valueOf(Double.parseDouble(jsonPrimitive.a())) : jsonPrimitive.a();
            }
            try {
                return Long.valueOf(la8.i(jsonPrimitive));
            } catch (JsonDecodingException e) {
                throw new NumberFormatException(e.getMessage());
            }
        }
        try {
            long jI = la8.i(jsonPrimitive);
            if (-2147483648L <= jI && jI <= 2147483647L) {
                return Integer.valueOf((int) jI);
            }
            throw new NumberFormatException(jsonPrimitive.a() + " is not an Int");
        } catch (JsonDecodingException e2) {
            throw new NumberFormatException(e2.getMessage());
        }
    }

    public static final String c(zs7 zs7Var) {
        int iOrdinal = zs7Var.ordinal();
        if (iOrdinal == 0) {
            return "canceledAuthState";
        }
        if (iOrdinal == 1) {
            return "canceledRules";
        }
        if (iOrdinal == 2) {
            return "snooze";
        }
        if (iOrdinal == 3) {
            return "allowNotifications";
        }
        l.g();
        return null;
    }

    public static final String d(ft7 ft7Var) {
        int iOrdinal = ft7Var.ordinal();
        if (iOrdinal == 0) {
            return "notDetermined";
        }
        if (iOrdinal == 1) {
            return "denied";
        }
        if (iOrdinal == 2) {
            return "authorized";
        }
        l.g();
        return null;
    }

    public static final qm1 e(PushModalConfigData pushModalConfigData) {
        String str = pushModalConfigData.b;
        if (str == null || (wve.K(str, "data:", false) && zve.L(str, "base64,", false))) {
            return new qm1(str, pushModalConfigData);
        }
        l5.q("customImage: value must be a base64 data URI (data:image/...;base64,...)");
        return null;
    }

    public static final ht7 f(String str) {
        if (wl7.b(str, "alertDialog")) {
            return ht7.a;
        }
        if (wl7.b(str, "bottomSheet")) {
            return ht7.b;
        }
        l5.q(l5.l("Unknown presentationType: ", str));
        return null;
    }
}

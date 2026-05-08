package defpackage;

import android.net.Uri;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.indeed.android.jsmappservices.bridge.AceNewConversationCommand;
import com.indeed.android.jsmappservices.bridge.AceNewConversationCommand$$serializer;
import com.indeed.android.jsmappservices.bridge.AceOpenConversationWithIdCommand;
import com.indeed.android.jsmappservices.bridge.AceOpenConversationWithIdCommand$$serializer;
import com.indeed.android.jsmappservices.bridge.ActionOverflowCommand;
import com.indeed.android.jsmappservices.bridge.ActionOverflowCommand$$serializer;
import com.indeed.android.jsmappservices.bridge.AppConsoleLog;
import com.indeed.android.jsmappservices.bridge.AppConsoleLog$$serializer;
import com.indeed.android.jsmappservices.bridge.CallPhoneNumberCommand;
import com.indeed.android.jsmappservices.bridge.CallPhoneNumberCommand$$serializer;
import com.indeed.android.jsmappservices.bridge.CanShowPushPromptCommand;
import com.indeed.android.jsmappservices.bridge.Command;
import com.indeed.android.jsmappservices.bridge.DismissApplyWebView;
import com.indeed.android.jsmappservices.bridge.DismissModalWithWebView;
import com.indeed.android.jsmappservices.bridge.DismissModalWithWebView$$serializer;
import com.indeed.android.jsmappservices.bridge.DisplayToastCommand;
import com.indeed.android.jsmappservices.bridge.DisplayToastCommand$$serializer;
import com.indeed.android.jsmappservices.bridge.GetAvailableMethodsCommand;
import com.indeed.android.jsmappservices.bridge.GetCachedValueCommand;
import com.indeed.android.jsmappservices.bridge.GetCachedValueCommand$$serializer;
import com.indeed.android.jsmappservices.bridge.GetNativeAppInfoCommand;
import com.indeed.android.jsmappservices.bridge.GetPushAuthorizationStatusCommand;
import com.indeed.android.jsmappservices.bridge.IncrementPushSignificantEventCommand;
import com.indeed.android.jsmappservices.bridge.IndeedApplyDidCompleteCommand;
import com.indeed.android.jsmappservices.bridge.IndeedApplyDidCompleteCommand$$serializer;
import com.indeed.android.jsmappservices.bridge.IsGeolocationGrantedCommand;
import com.indeed.android.jsmappservices.bridge.MarkHomePageReadyCommand;
import com.indeed.android.jsmappservices.bridge.NavigateToInterviewPrepCommand;
import com.indeed.android.jsmappservices.bridge.NavigateToInterviewPrepCommand$$serializer;
import com.indeed.android.jsmappservices.bridge.NavigateToLogin;
import com.indeed.android.jsmappservices.bridge.NavigateToLogin$$serializer;
import com.indeed.android.jsmappservices.bridge.NavigateToResumeCoachCommand;
import com.indeed.android.jsmappservices.bridge.NavigateToResumeCoachCommand$$serializer;
import com.indeed.android.jsmappservices.bridge.OpenAndroidAppInfoCommand;
import com.indeed.android.jsmappservices.bridge.OpenOnboardingModalCommand;
import com.indeed.android.jsmappservices.bridge.OpenOnboardingModalCommand$$serializer;
import com.indeed.android.jsmappservices.bridge.OpenPushNotificationAuthorizationSettingsCommand;
import com.indeed.android.jsmappservices.bridge.RegisterViewJobNavBarSaveButtonClickHandler;
import com.indeed.android.jsmappservices.bridge.RegisterViewJobNavBarSaveButtonClickHandler$$serializer;
import com.indeed.android.jsmappservices.bridge.RequestImmediateSystemPushAuthorizationCommand;
import com.indeed.android.jsmappservices.bridge.RequestImmediateSystemPushAuthorizationCommand$$serializer;
import com.indeed.android.jsmappservices.bridge.RequestPushReengagementModalCommand;
import com.indeed.android.jsmappservices.bridge.RequestPushReengagementModalCommand$$serializer;
import com.indeed.android.jsmappservices.bridge.RequestSystemPushAuthWithPrimerCommand;
import com.indeed.android.jsmappservices.bridge.RequestSystemPushAuthWithPrimerCommand$$serializer;
import com.indeed.android.jsmappservices.bridge.ResetPushPromptCooldownTimeoutCommand;
import com.indeed.android.jsmappservices.bridge.SetCachedValueCommand;
import com.indeed.android.jsmappservices.bridge.SetCachedValueCommand$$serializer;
import com.indeed.android.jsmappservices.bridge.SetViewJobNavBarSaveButtonStateCommand;
import com.indeed.android.jsmappservices.bridge.SetViewJobNavBarSaveButtonStateCommand$$serializer;
import com.indeed.android.jsmappservices.bridge.ShareContentCommand;
import com.indeed.android.jsmappservices.bridge.ShareContentCommand$$serializer;
import com.indeed.android.jsmappservices.bridge.ShareDiagnosticsCommand;
import com.indeed.android.jsmappservices.bridge.ShareDiagnosticsCommand$$serializer;
import com.indeed.android.jsmappservices.bridge.ShowModalWithWebView;
import com.indeed.android.jsmappservices.bridge.ShowModalWithWebView$$serializer;
import com.indeed.android.jsmappservices.bridge.ShowModalWithWebViewAndWaitForResult;
import com.indeed.android.jsmappservices.bridge.ShowModalWithWebViewAndWaitForResult$$serializer;
import com.indeed.android.jsmappservices.bridge.ShowSearchOverlayCommand;
import com.indeed.android.jsmappservices.bridge.ShowSearchOverlayCommand$$serializer;
import com.indeed.android.jsmappservices.bridge.StartIndeedApplyCommand;
import com.indeed.android.jsmappservices.bridge.StartIndeedApplyCommand$$serializer;
import com.indeed.android.jsmappservices.bridge.WebOnboardingOnComplete;
import com.indeed.android.jsmappservices.bridge.WebOnboardingOnComplete$$serializer;
import defpackage.jq7;
import defpackage.v03;
import defpackage.vid;
import defpackage.yj3;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlinx.serialization.KSerializer;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class fc2 implements gu5 {
    public final /* synthetic */ int a;

    public /* synthetic */ fc2(int i) {
        this.a = i;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        int i = 3;
        switch (this.a) {
            case 0:
                iwc iwcVar = fwc.a;
                return new atd("com.indeed.android.jsmappservices.bridge.Command", iwcVar.b(Command.class), new yd8[]{iwcVar.b(AceNewConversationCommand.class), iwcVar.b(AceOpenConversationWithIdCommand.class), iwcVar.b(ActionOverflowCommand.class), iwcVar.b(AppConsoleLog.class), iwcVar.b(CallPhoneNumberCommand.class), iwcVar.b(CanShowPushPromptCommand.class), iwcVar.b(DismissApplyWebView.class), iwcVar.b(DismissModalWithWebView.class), iwcVar.b(DisplayToastCommand.class), iwcVar.b(GetAvailableMethodsCommand.class), iwcVar.b(GetCachedValueCommand.class), iwcVar.b(GetNativeAppInfoCommand.class), iwcVar.b(GetPushAuthorizationStatusCommand.class), iwcVar.b(IncrementPushSignificantEventCommand.class), iwcVar.b(IndeedApplyDidCompleteCommand.class), iwcVar.b(IsGeolocationGrantedCommand.class), iwcVar.b(MarkHomePageReadyCommand.class), iwcVar.b(NavigateToInterviewPrepCommand.class), iwcVar.b(NavigateToLogin.class), iwcVar.b(NavigateToResumeCoachCommand.class), iwcVar.b(OpenAndroidAppInfoCommand.class), iwcVar.b(OpenOnboardingModalCommand.class), iwcVar.b(OpenPushNotificationAuthorizationSettingsCommand.class), iwcVar.b(RegisterViewJobNavBarSaveButtonClickHandler.class), iwcVar.b(RequestImmediateSystemPushAuthorizationCommand.class), iwcVar.b(RequestPushReengagementModalCommand.class), iwcVar.b(RequestSystemPushAuthWithPrimerCommand.class), iwcVar.b(ResetPushPromptCooldownTimeoutCommand.class), iwcVar.b(SetCachedValueCommand.class), iwcVar.b(SetViewJobNavBarSaveButtonStateCommand.class), iwcVar.b(ShareContentCommand.class), iwcVar.b(ShareDiagnosticsCommand.class), iwcVar.b(ShowModalWithWebView.class), iwcVar.b(ShowModalWithWebViewAndWaitForResult.class), iwcVar.b(ShowSearchOverlayCommand.class), iwcVar.b(StartIndeedApplyCommand.class), iwcVar.b(WebOnboardingOnComplete.class)}, new KSerializer[]{AceNewConversationCommand$$serializer.INSTANCE, AceOpenConversationWithIdCommand$$serializer.INSTANCE, ActionOverflowCommand$$serializer.INSTANCE, AppConsoleLog$$serializer.INSTANCE, CallPhoneNumberCommand$$serializer.INSTANCE, new rna("com.indeed.android.jsmappservices.bridge.CanShowPushPromptCommand", CanShowPushPromptCommand.INSTANCE, new Annotation[0]), new rna("com.indeed.android.jsmappservices.bridge.DismissApplyWebView", DismissApplyWebView.INSTANCE, new Annotation[0]), DismissModalWithWebView$$serializer.INSTANCE, DisplayToastCommand$$serializer.INSTANCE, new rna("com.indeed.android.jsmappservices.bridge.GetAvailableMethodsCommand", GetAvailableMethodsCommand.INSTANCE, new Annotation[0]), GetCachedValueCommand$$serializer.INSTANCE, new rna("com.indeed.android.jsmappservices.bridge.GetNativeAppInfoCommand", GetNativeAppInfoCommand.INSTANCE, new Annotation[0]), new rna("com.indeed.android.jsmappservices.bridge.GetPushAuthorizationStatusCommand", GetPushAuthorizationStatusCommand.INSTANCE, new Annotation[0]), new rna("com.indeed.android.jsmappservices.bridge.IncrementPushSignificantEventCommand", IncrementPushSignificantEventCommand.INSTANCE, new Annotation[0]), IndeedApplyDidCompleteCommand$$serializer.INSTANCE, new rna("com.indeed.android.jsmappservices.bridge.IsGeolocationGrantedCommand", IsGeolocationGrantedCommand.INSTANCE, new Annotation[0]), new rna("com.indeed.android.jsmappservices.bridge.MarkHomePageReadyCommand", MarkHomePageReadyCommand.INSTANCE, new Annotation[0]), NavigateToInterviewPrepCommand$$serializer.INSTANCE, NavigateToLogin$$serializer.INSTANCE, NavigateToResumeCoachCommand$$serializer.INSTANCE, new rna("com.indeed.android.jsmappservices.bridge.OpenAndroidAppInfoCommand", OpenAndroidAppInfoCommand.INSTANCE, new Annotation[0]), OpenOnboardingModalCommand$$serializer.INSTANCE, new rna("com.indeed.android.jsmappservices.bridge.OpenPushNotificationAuthorizationSettingsCommand", OpenPushNotificationAuthorizationSettingsCommand.INSTANCE, new Annotation[0]), RegisterViewJobNavBarSaveButtonClickHandler$$serializer.INSTANCE, RequestImmediateSystemPushAuthorizationCommand$$serializer.INSTANCE, RequestPushReengagementModalCommand$$serializer.INSTANCE, RequestSystemPushAuthWithPrimerCommand$$serializer.INSTANCE, new rna("com.indeed.android.jsmappservices.bridge.ResetPushPromptCooldownTimeoutCommand", ResetPushPromptCooldownTimeoutCommand.INSTANCE, new Annotation[0]), SetCachedValueCommand$$serializer.INSTANCE, SetViewJobNavBarSaveButtonStateCommand$$serializer.INSTANCE, ShareContentCommand$$serializer.INSTANCE, ShareDiagnosticsCommand$$serializer.INSTANCE, ShowModalWithWebView$$serializer.INSTANCE, ShowModalWithWebViewAndWaitForResult$$serializer.INSTANCE, ShowSearchOverlayCommand$$serializer.INSTANCE, StartIndeedApplyCommand$$serializer.INSTANCE, WebOnboardingOnComplete$$serializer.INSTANCE}, new Annotation[0]);
            case 1:
                return Uri.parse("android-app://com.indeed.android.jobsearch.widget.rs");
            case 2:
                return j6g.a;
            case 3:
                return j6g.a;
            case 4:
                Collection collectionValues = e87.a().values();
                ArrayList arrayList = new ArrayList(t92.r0(collectionValues, 10));
                Iterator it = collectionValues.iterator();
                while (it.hasNext()) {
                    arrayList.add(((ck6) it.next()).c);
                }
                return z92.E1(arrayList);
            case 5:
                return new gt0(mve.a, 0);
            case 6:
                return new rna("MyJobs", jq7.q.INSTANCE, new Annotation[0]);
            case 7:
                return web.j("com.indeed.android.tare.nav.LoginModalResultT", w49.values(), new String[]{"SUCCESS", "CANCEL"}, new Annotation[][]{null, null});
            case 8:
                OkHttpClient.Builder builderE = ((v1g) cr8.p(v1g.class)).c().e();
                builderE.c.add(new jq9());
                return new OkHttpClient(builderE);
            case DatadogLogGenerator.CRASH /* 9 */:
                eze ezeVarA = wea.a();
                eq3 eq3Var = a74.a;
                return f13.a(v03.a.C0438a.c(ezeVarA, no3.c));
            case 10:
                epa epaVar = epa.a;
                OkHttpClient.Builder builderE2 = epa.e().e();
                builderE2.c.add(new s97(new n7(7)));
                builderE2.a(epa.c());
                builderE2.b(15L, TimeUnit.SECONDS);
                return new OkHttpClient(builderE2);
            case 11:
                m2c.c(pjb.W);
                return j6g.a;
            case 12:
                return j6g.a;
            case 13:
                List listP1 = z92.p1((List) l8e.b.getValue(), new ym9(i));
                ArrayList arrayList2 = new ArrayList();
                int size = listP1.size();
                for (int i2 = 0; i2 < size; i2++) {
                    yj3.a aVarA = ((ek3) listP1.get(i2)).a();
                    if (aVarA != null) {
                        arrayList2.add(aVarA);
                    }
                }
                return arrayList2;
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                return new rna("com.indeed.android.realtimemessaging.models.SSEEvent.Heartbeat", vid.e.INSTANCE, new Annotation[0]);
            case 15:
                return web.j("com.indeed.android.tare.nav.ScheduleApplyOnboardingResultT", xnd.values(), new String[]{"COMPLETED", "CANCELLED"}, new Annotation[][]{null, null});
            case 16:
                return new by8(mve.a, na8.a);
            case 17:
                throw new IllegalStateException("OnActionCallback not provided");
            default:
                ne4 ne4Var = idf.a;
                return null;
        }
    }
}

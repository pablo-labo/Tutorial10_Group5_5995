package defpackage;

import android.util.Log;
import android.util.Pair;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.c;
import androidx.fragment.app.r;
import androidx.media3.exoplayer.i;
import androidx.media3.exoplayer.source.h;
import androidx.media3.session.j;
import androidx.media3.session.k;
import androidx.media3.session.m;
import androidx.media3.session.r;
import androidx.media3.session.s;
import androidx.media3.session.x;
import app.rive.runtime.kotlin.renderers.RendererMetrics;
import com.datadog.android.core.internal.net.info.BroadcastReceiverNetworkInfoProvider;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.indeed.android.jsmappservices.bridge.AceNewConversationCommand;
import com.indeed.android.jsmappservices.bridge.AceNewConversationData;
import com.indeed.android.jsmappservices.bridge.AceOpenConversationWithIdCommand;
import com.indeed.android.jsmappservices.bridge.AceOpenConversationWithIdData;
import com.indeed.android.jsmappservices.bridge.ActionOverflowCommand;
import com.indeed.android.jsmappservices.bridge.ActionOverflowData;
import com.indeed.android.jsmappservices.bridge.AppConsoleLog;
import com.indeed.android.jsmappservices.bridge.AppConsoleLogData;
import com.indeed.android.jsmappservices.bridge.BridgeDispatcher;
import com.indeed.android.jsmappservices.bridge.CallPhoneNumberCommand;
import com.indeed.android.jsmappservices.bridge.CallPhoneNumberData;
import com.indeed.android.jsmappservices.bridge.CanShowPushPromptCommand;
import com.indeed.android.jsmappservices.bridge.Command;
import com.indeed.android.jsmappservices.bridge.CommandDataJson;
import com.indeed.android.jsmappservices.bridge.CommandJson;
import com.indeed.android.jsmappservices.bridge.DismissApplyWebView;
import com.indeed.android.jsmappservices.bridge.DismissModalWithWebView;
import com.indeed.android.jsmappservices.bridge.DismissModalWithWebViewData;
import com.indeed.android.jsmappservices.bridge.DisplayToastCommand;
import com.indeed.android.jsmappservices.bridge.DisplayToastData;
import com.indeed.android.jsmappservices.bridge.GetAvailableMethodsCommand;
import com.indeed.android.jsmappservices.bridge.GetCachedValueCommand;
import com.indeed.android.jsmappservices.bridge.GetCachedValueData;
import com.indeed.android.jsmappservices.bridge.GetNativeAppInfoCommand;
import com.indeed.android.jsmappservices.bridge.GetPushAuthorizationStatusCommand;
import com.indeed.android.jsmappservices.bridge.ImmediatePushAuthCommandData;
import com.indeed.android.jsmappservices.bridge.IncrementPushSignificantEventCommand;
import com.indeed.android.jsmappservices.bridge.IndeedApplyDidCompleteCommand;
import com.indeed.android.jsmappservices.bridge.IndeedApplyDidCompleteData;
import com.indeed.android.jsmappservices.bridge.IsGeolocationGrantedCommand;
import com.indeed.android.jsmappservices.bridge.MarkHomePageReadyCommand;
import com.indeed.android.jsmappservices.bridge.NavigateToInterviewPrepCommand;
import com.indeed.android.jsmappservices.bridge.NavigateToInterviewPrepCommandData;
import com.indeed.android.jsmappservices.bridge.NavigateToLogin;
import com.indeed.android.jsmappservices.bridge.NavigateToLoginData;
import com.indeed.android.jsmappservices.bridge.OpenAndroidAppInfoCommand;
import com.indeed.android.jsmappservices.bridge.OpenOnboardingModalCommand;
import com.indeed.android.jsmappservices.bridge.OpenOnboardingModalData;
import com.indeed.android.jsmappservices.bridge.OpenPushNotificationAuthorizationSettingsCommand;
import com.indeed.android.jsmappservices.bridge.PushPrimerCommandData;
import com.indeed.android.jsmappservices.bridge.RegisterViewJobNavBarSaveButtonClickHandler;
import com.indeed.android.jsmappservices.bridge.RegisterViewJobNavBarSaveButtonClickHandlerData;
import com.indeed.android.jsmappservices.bridge.RequestImmediateSystemPushAuthorizationCommand;
import com.indeed.android.jsmappservices.bridge.RequestPushReengagementModalCommand;
import com.indeed.android.jsmappservices.bridge.RequestSystemPushAuthWithPrimerCommand;
import com.indeed.android.jsmappservices.bridge.ResetPushPromptCooldownTimeoutCommand;
import com.indeed.android.jsmappservices.bridge.SetCachedValueCommand;
import com.indeed.android.jsmappservices.bridge.SetCachedValueData;
import com.indeed.android.jsmappservices.bridge.SetViewJobNavBarSaveButtonStateCommand;
import com.indeed.android.jsmappservices.bridge.SetViewJobNavBarSaveButtonStateData;
import com.indeed.android.jsmappservices.bridge.ShareContentCommand;
import com.indeed.android.jsmappservices.bridge.ShareContentData;
import com.indeed.android.jsmappservices.bridge.ShareDiagnosticsCommand;
import com.indeed.android.jsmappservices.bridge.ShareDiagnosticsData;
import com.indeed.android.jsmappservices.bridge.ShowModalWithWebView;
import com.indeed.android.jsmappservices.bridge.ShowModalWithWebViewAndWaitForResult;
import com.indeed.android.jsmappservices.bridge.ShowModalWithWebviewData;
import com.indeed.android.jsmappservices.bridge.ShowSearchOverlayCommand;
import com.indeed.android.jsmappservices.bridge.ShowSearchOverlayData;
import com.indeed.android.jsmappservices.bridge.StartIndeedApplyCommand;
import com.indeed.android.jsmappservices.bridge.StartIndeedApplyData;
import com.indeed.android.jsmappservices.bridge.WebOnboardingOnComplete;
import com.indeed.android.jsmappservices.bridge.WebOnboardingOnCompleteData;
import com.oney.WebRTCModule.WebRTCModule;
import defpackage.j2;
import java.util.ArrayList;
import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class tm1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ tm1(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Command shareContentCommand;
        Command command;
        switch (this.a) {
            case 0:
                BridgeDispatcher bridgeDispatcher = (BridgeDispatcher) this.b;
                String str = (String) this.c;
                String url = bridgeDispatcher.b.getUrl();
                if (url == null) {
                    ArrayList arrayList = lz2.a;
                    lz2.c("BridgeDispatcher", "Current webview url is null", false, null, 12);
                    return;
                }
                if (!bridgeDispatcher.c.invoke(url).booleanValue()) {
                    ArrayList arrayList2 = lz2.a;
                    lz2.a("BridgeDispatcher", "The current webview url is not allowed to run dispatchCommand", url);
                    return;
                }
                try {
                    ra8 ra8Var = um1.a;
                    CommandJson commandJson = (CommandJson) ra8Var.c(CommandJson.INSTANCE.serializer(), str);
                    String str2 = commandJson.b;
                    String str3 = commandJson.a;
                    BridgeDispatcher.c cVar = new BridgeDispatcher.c(str2, bridgeDispatcher);
                    try {
                        ic2 ic2Var = (ic2) um1.b.get(str3);
                        switch (ic2Var == null ? -1 : BridgeDispatcher.b.a[ic2Var.ordinal()]) {
                            case 1:
                                shareContentCommand = new ShareContentCommand((ShareContentData) ((CommandDataJson) ra8Var.c(CommandDataJson.INSTANCE.serializer(ShareContentData.INSTANCE.serializer()), str)).a);
                                command = shareContentCommand;
                                bridgeDispatcher.d.a(command, cVar);
                                return;
                            case 2:
                                shareContentCommand = new ActionOverflowCommand((ActionOverflowData) ((CommandDataJson) ra8Var.c(CommandDataJson.INSTANCE.serializer(ActionOverflowData.INSTANCE.serializer()), str)).a);
                                command = shareContentCommand;
                                bridgeDispatcher.d.a(command, cVar);
                                return;
                            case 3:
                                shareContentCommand = new ShareDiagnosticsCommand((ShareDiagnosticsData) ((CommandDataJson) ra8Var.c(CommandDataJson.INSTANCE.serializer(ShareDiagnosticsData.INSTANCE.serializer()), str)).a);
                                command = shareContentCommand;
                                bridgeDispatcher.d.a(command, cVar);
                                return;
                            case 4:
                                shareContentCommand = new StartIndeedApplyCommand((StartIndeedApplyData) ((CommandDataJson) ra8Var.c(CommandDataJson.INSTANCE.serializer(StartIndeedApplyData.INSTANCE.serializer()), str)).a);
                                command = shareContentCommand;
                                bridgeDispatcher.d.a(command, cVar);
                                return;
                            case 5:
                                shareContentCommand = new IndeedApplyDidCompleteCommand((IndeedApplyDidCompleteData) ((CommandDataJson) ra8Var.c(CommandDataJson.INSTANCE.serializer(IndeedApplyDidCompleteData.INSTANCE.serializer()), str)).a);
                                command = shareContentCommand;
                                bridgeDispatcher.d.a(command, cVar);
                                return;
                            case 6:
                                command = GetAvailableMethodsCommand.INSTANCE;
                                bridgeDispatcher.d.a(command, cVar);
                                return;
                            case 7:
                                command = GetNativeAppInfoCommand.INSTANCE;
                                bridgeDispatcher.d.a(command, cVar);
                                return;
                            case 8:
                                shareContentCommand = new CallPhoneNumberCommand((CallPhoneNumberData) ((CommandDataJson) ra8Var.c(CommandDataJson.INSTANCE.serializer(CallPhoneNumberData.INSTANCE.serializer()), str)).a);
                                command = shareContentCommand;
                                bridgeDispatcher.d.a(command, cVar);
                                return;
                            case DatadogLogGenerator.CRASH /* 9 */:
                                shareContentCommand = new DisplayToastCommand((DisplayToastData) ((CommandDataJson) ra8Var.c(CommandDataJson.INSTANCE.serializer(DisplayToastData.INSTANCE.serializer()), str)).a);
                                command = shareContentCommand;
                                bridgeDispatcher.d.a(command, cVar);
                                return;
                            case 10:
                                shareContentCommand = new ShowSearchOverlayCommand((ShowSearchOverlayData) ((CommandDataJson) ra8Var.c(CommandDataJson.INSTANCE.serializer(ShowSearchOverlayData.INSTANCE.serializer()), str)).a);
                                command = shareContentCommand;
                                bridgeDispatcher.d.a(command, cVar);
                                return;
                            case 11:
                                command = IsGeolocationGrantedCommand.INSTANCE;
                                bridgeDispatcher.d.a(command, cVar);
                                return;
                            case 12:
                                command = OpenAndroidAppInfoCommand.INSTANCE;
                                bridgeDispatcher.d.a(command, cVar);
                                return;
                            case 13:
                                shareContentCommand = new ShowModalWithWebView((ShowModalWithWebviewData) ((CommandDataJson) ra8Var.c(CommandDataJson.INSTANCE.serializer(ShowModalWithWebviewData.INSTANCE.serializer()), str)).a);
                                command = shareContentCommand;
                                bridgeDispatcher.d.a(command, cVar);
                                return;
                            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                                shareContentCommand = new ShowModalWithWebViewAndWaitForResult((ShowModalWithWebviewData) ((CommandDataJson) ra8Var.c(CommandDataJson.INSTANCE.serializer(ShowModalWithWebviewData.INSTANCE.serializer()), str)).a);
                                command = shareContentCommand;
                                bridgeDispatcher.d.a(command, cVar);
                                return;
                            case 15:
                                shareContentCommand = new DismissModalWithWebView((DismissModalWithWebViewData) ((CommandDataJson) ra8Var.c(CommandDataJson.INSTANCE.serializer(DismissModalWithWebViewData.INSTANCE.serializer()), str)).a);
                                command = shareContentCommand;
                                bridgeDispatcher.d.a(command, cVar);
                                return;
                            case 16:
                                command = DismissApplyWebView.INSTANCE;
                                bridgeDispatcher.d.a(command, cVar);
                                return;
                            case 17:
                                shareContentCommand = new AppConsoleLog((AppConsoleLogData) ((CommandDataJson) ra8Var.c(CommandDataJson.INSTANCE.serializer(AppConsoleLogData.INSTANCE.serializer()), str)).a);
                                command = shareContentCommand;
                                bridgeDispatcher.d.a(command, cVar);
                                return;
                            case 18:
                                shareContentCommand = new SetViewJobNavBarSaveButtonStateCommand((SetViewJobNavBarSaveButtonStateData) ((CommandDataJson) ra8Var.c(CommandDataJson.INSTANCE.serializer(SetViewJobNavBarSaveButtonStateData.INSTANCE.serializer()), str)).a);
                                command = shareContentCommand;
                                bridgeDispatcher.d.a(command, cVar);
                                return;
                            case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
                                shareContentCommand = new RegisterViewJobNavBarSaveButtonClickHandler((RegisterViewJobNavBarSaveButtonClickHandlerData) ((CommandDataJson) ra8Var.c(CommandDataJson.INSTANCE.serializer(RegisterViewJobNavBarSaveButtonClickHandlerData.INSTANCE.serializer()), str)).a);
                                command = shareContentCommand;
                                bridgeDispatcher.d.a(command, cVar);
                                return;
                            case 20:
                                shareContentCommand = new WebOnboardingOnComplete((WebOnboardingOnCompleteData) ((CommandDataJson) ra8Var.c(CommandDataJson.INSTANCE.serializer(WebOnboardingOnCompleteData.INSTANCE.serializer()), str)).a);
                                command = shareContentCommand;
                                bridgeDispatcher.d.a(command, cVar);
                                return;
                            case 21:
                                shareContentCommand = new GetCachedValueCommand((GetCachedValueData) ((CommandDataJson) ra8Var.c(CommandDataJson.INSTANCE.serializer(GetCachedValueData.INSTANCE.serializer()), str)).a);
                                command = shareContentCommand;
                                bridgeDispatcher.d.a(command, cVar);
                                return;
                            case 22:
                                shareContentCommand = new SetCachedValueCommand((SetCachedValueData) ((CommandDataJson) ra8Var.c(CommandDataJson.INSTANCE.serializer(SetCachedValueData.INSTANCE.serializer()), str)).a);
                                command = shareContentCommand;
                                bridgeDispatcher.d.a(command, cVar);
                                return;
                            case 23:
                                shareContentCommand = new NavigateToLogin((NavigateToLoginData) ((CommandDataJson) ra8Var.c(CommandDataJson.INSTANCE.serializer(NavigateToLoginData.INSTANCE.serializer()), str)).a);
                                command = shareContentCommand;
                                bridgeDispatcher.d.a(command, cVar);
                                return;
                            case 24:
                                shareContentCommand = new AceNewConversationCommand((AceNewConversationData) ((CommandDataJson) ra8Var.c(CommandDataJson.INSTANCE.serializer(AceNewConversationData.INSTANCE.serializer()), str)).a);
                                command = shareContentCommand;
                                bridgeDispatcher.d.a(command, cVar);
                                return;
                            case 25:
                                shareContentCommand = new AceOpenConversationWithIdCommand((AceOpenConversationWithIdData) ((CommandDataJson) ra8Var.c(CommandDataJson.INSTANCE.serializer(AceOpenConversationWithIdData.INSTANCE.serializer()), str)).a);
                                command = shareContentCommand;
                                bridgeDispatcher.d.a(command, cVar);
                                return;
                            case 26:
                                command = MarkHomePageReadyCommand.INSTANCE;
                                bridgeDispatcher.d.a(command, cVar);
                                return;
                            case 27:
                                shareContentCommand = new OpenOnboardingModalCommand((OpenOnboardingModalData) ((CommandDataJson) ra8Var.c(CommandDataJson.INSTANCE.serializer(OpenOnboardingModalData.INSTANCE.serializer()), str)).a);
                                command = shareContentCommand;
                                bridgeDispatcher.d.a(command, cVar);
                                return;
                            case 28:
                                shareContentCommand = new NavigateToInterviewPrepCommand((NavigateToInterviewPrepCommandData) ((CommandDataJson) ra8Var.c(CommandDataJson.INSTANCE.serializer(NavigateToInterviewPrepCommandData.INSTANCE.serializer()), str)).a);
                                command = shareContentCommand;
                                bridgeDispatcher.d.a(command, cVar);
                                return;
                            case 29:
                                command = CanShowPushPromptCommand.INSTANCE;
                                bridgeDispatcher.d.a(command, cVar);
                                return;
                            case RendererMetrics.SAMPLES /* 30 */:
                                command = GetPushAuthorizationStatusCommand.INSTANCE;
                                bridgeDispatcher.d.a(command, cVar);
                                return;
                            case 31:
                                shareContentCommand = new RequestSystemPushAuthWithPrimerCommand((PushPrimerCommandData) ((CommandDataJson) ra8Var.c(CommandDataJson.INSTANCE.serializer(PushPrimerCommandData.INSTANCE.serializer()), str)).a);
                                command = shareContentCommand;
                                bridgeDispatcher.d.a(command, cVar);
                                return;
                            case 32:
                                shareContentCommand = new RequestPushReengagementModalCommand((PushPrimerCommandData) ((CommandDataJson) ra8Var.c(CommandDataJson.INSTANCE.serializer(PushPrimerCommandData.INSTANCE.serializer()), str)).a);
                                command = shareContentCommand;
                                bridgeDispatcher.d.a(command, cVar);
                                return;
                            case 33:
                                shareContentCommand = new RequestImmediateSystemPushAuthorizationCommand((ImmediatePushAuthCommandData) ((CommandDataJson) ra8Var.c(CommandDataJson.INSTANCE.serializer(ImmediatePushAuthCommandData.INSTANCE.serializer()), str)).a);
                                command = shareContentCommand;
                                bridgeDispatcher.d.a(command, cVar);
                                return;
                            case 34:
                                command = OpenPushNotificationAuthorizationSettingsCommand.INSTANCE;
                                bridgeDispatcher.d.a(command, cVar);
                                return;
                            case 35:
                                command = ResetPushPromptCooldownTimeoutCommand.INSTANCE;
                                bridgeDispatcher.d.a(command, cVar);
                                return;
                            case 36:
                                command = IncrementPushSignificantEventCommand.INSTANCE;
                                bridgeDispatcher.d.a(command, cVar);
                                return;
                            default:
                                ArrayList arrayList3 = lz2.a;
                                lz2.c("BridgeDispatcher", "Unknown command " + str3, false, null, 12);
                                return;
                        }
                    } catch (SerializationException e) {
                        ArrayList arrayList4 = lz2.a;
                        lz2.c("BridgeDispatcher", "Error deserializing command json", false, e, 4);
                        cVar.d("Error deserializing command json");
                        return;
                    }
                } catch (Exception e2) {
                    if (!(e2 instanceof SerializationException)) {
                        throw e2;
                    }
                    ArrayList arrayList5 = lz2.a;
                    lz2.b("BridgeDispatcher", "Exception deserializing command", false, e2);
                    return;
                }
            case 1:
                c.C0034c c0034c = (c.C0034c) this.b;
                r.b bVar = (r.b) this.c;
                c0034c.a();
                if (FragmentManager.K(2)) {
                    Log.v("FragmentManager", "Transition for operation " + bVar + " has completed");
                    return;
                }
                return;
            case 2:
                ((qw1) this.b).D((pf6) this.c, j6g.a);
                return;
            case 3:
                sg9 sg9Var = (sg9) this.b;
                j jVar = (j) this.c;
                if (sg9Var.a instanceof j2.b) {
                    jVar.T0();
                    return;
                }
                return;
            case 4:
                k kVar = (k) this.b;
                m.a aVar = (m.a) this.c;
                if (kVar.o) {
                    return;
                }
                aVar.f(kVar);
                return;
            case 5:
                s sVar = (s) this.b;
                r.d dVar = (r.d) this.c;
                x xVar = sVar.g;
                xVar.getClass();
                xVar.m1(dVar, Integer.MIN_VALUE, 1, x.o1(new z65(1, xVar, dVar)));
                return;
            case 6:
                i.a aVar2 = (i.a) this.b;
                Pair pair = (Pair) this.c;
                aVar2.b.h.s0(((Integer) pair.first).intValue(), (h.b) pair.second);
                return;
            default:
                ((WebRTCModule) this.b).lambda$mediaStreamRelease$16((String) this.c);
                return;
        }
    }
}

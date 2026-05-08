package com.indeed.android.rnprofile;

import android.app.Activity;
import androidx.fragment.app.g;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseProfileFormsNativeModule;
import com.indeed.android.rnprofile.RNProfileFormsModule;
import defpackage.as7;
import defpackage.bb;
import defpackage.bs7;
import defpackage.cr8;
import defpackage.cs7;
import defpackage.d30;
import defpackage.es7;
import defpackage.fq0;
import defpackage.fs;
import defpackage.fs7;
import defpackage.fu;
import defpackage.gh;
import defpackage.gs0;
import defpackage.gs7;
import defpackage.gu;
import defpackage.hs7;
import defpackage.is7;
import defpackage.iu;
import defpackage.j6g;
import defpackage.jd;
import defpackage.jh;
import defpackage.js7;
import defpackage.kc;
import defpackage.ks7;
import defpackage.ku;
import defpackage.l5;
import defpackage.lr5;
import defpackage.ls7;
import defpackage.n91;
import defpackage.nmc;
import defpackage.nn8;
import defpackage.ns7;
import defpackage.nu;
import defpackage.o61;
import defpackage.ol1;
import defpackage.or7;
import defpackage.os7;
import defpackage.pr7;
import defpackage.ps7;
import defpackage.pu;
import defpackage.qa3;
import defpackage.qg;
import defpackage.qr7;
import defpackage.qs7;
import defpackage.rs7;
import defpackage.ss7;
import defpackage.td;
import defpackage.tn0;
import defpackage.tr7;
import defpackage.tt2;
import defpackage.uc;
import defpackage.ug;
import defpackage.ur7;
import defpackage.us7;
import defpackage.vr7;
import defpackage.vs7;
import defpackage.wj4;
import defpackage.ws7;
import defpackage.xb;
import defpackage.xr7;
import defpackage.xs7;
import defpackage.yr7;
import defpackage.zr7;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@nmc(name = IndeedRNBridgeBaseProfileFormsNativeModule.MODULE_NAME)
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001\"B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0017¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u001b2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u0006H\u0002¢\u0006\u0004\b \u0010\u001f¨\u0006#"}, d2 = {"Lcom/indeed/android/rnprofile/RNProfileFormsModule;", "Lcom/indeed/android/reactnative/nativemodules/generated/IndeedRNBridgeBaseProfileFormsNativeModule;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "sectionType", "Lcom/facebook/react/bridge/ReadableMap;", "options", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "Lj6g;", "presentNativeResumeOtherSectionForm", "(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V", "mode", "itemId", "Lur7;", "parseFormMode", "(Ljava/lang/String;Ljava/lang/String;)Lur7;", "Lps7;", "result", "", "data", "Lcom/facebook/react/bridge/WritableMap;", "createResultMap", "(Lps7;Ljava/lang/Object;)Lcom/facebook/react/bridge/WritableMap;", "Lhs7;", "(Lhs7;Ljava/lang/Object;)Lcom/facebook/react/bridge/WritableMap;", "errorMessage", "createErrorResult", "(Ljava/lang/String;)Lcom/facebook/react/bridge/WritableMap;", "createNotImplementedResult", "Companion", "a", "rnprofile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RNProfileFormsModule extends IndeedRNBridgeBaseProfileFormsNativeModule {
    private static final String FORM_NAME_PROFILE = "profileForm";
    public static final int $stable = IndeedRNBridgeBaseProfileFormsNativeModule.$stable;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RNProfileFormsModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        reactApplicationContext.getClass();
    }

    private final WritableMap createErrorResult(String errorMessage) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.getClass();
        writableMapCreateMap.putBoolean("success", false);
        writableMapCreateMap.putString("result", "ERROR");
        writableMapCreateMap.putString("error", errorMessage);
        return writableMapCreateMap;
    }

    private final WritableMap createNotImplementedResult(String errorMessage) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.getClass();
        writableMapCreateMap.putBoolean("success", false);
        writableMapCreateMap.putString("result", "NOT_IMPLEMENTED");
        writableMapCreateMap.putString("error", errorMessage);
        return writableMapCreateMap;
    }

    private final WritableMap createResultMap(ps7 result, Object data) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.getClass();
        writableMapCreateMap.putBoolean("success", result != ps7.e);
        writableMapCreateMap.putString("result", result.name());
        if (data != null) {
            writableMapCreateMap.putString("data", data.toString());
        }
        return writableMapCreateMap;
    }

    public static /* synthetic */ WritableMap createResultMap$default(RNProfileFormsModule rNProfileFormsModule, ps7 ps7Var, Object obj, int i, Object obj2) {
        if ((i & 2) != 0) {
            obj = null;
        }
        return rNProfileFormsModule.createResultMap(ps7Var, obj);
    }

    private final ur7 parseFormMode(String mode, String itemId) {
        String lowerCase = mode.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        int iHashCode = lowerCase.hashCode();
        if (iHashCode != 96417) {
            if (iHashCode != 3108362) {
                if (iHashCode == 1197722116 && lowerCase.equals("suggestion")) {
                    return ur7.b.a;
                }
            } else if (lowerCase.equals("edit")) {
                if (itemId == null) {
                    itemId = "";
                }
                return new ur7.c(itemId);
            }
        } else if (lowerCase.equals("add")) {
            return ur7.a.a;
        }
        l5.q(l5.m("Unsupported mode: ", mode, ". Only 'add' and 'edit' are supported."));
        return null;
    }

    public static /* synthetic */ ur7 parseFormMode$default(RNProfileFormsModule rNProfileFormsModule, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return rNProfileFormsModule.parseFormMode(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final void presentNativeResumeOtherSectionForm$lambda$28(ReadableMap readableMap, Promise promise, RNProfileFormsModule rNProfileFormsModule, String str) {
        try {
            String string = readableMap.getString("mode");
            if (string == null) {
                promise.resolve(rNProfileFormsModule.createErrorResult("Missing required 'mode' parameter"));
                return;
            }
            ReadableMap map = readableMap.hasKey("payload") ? readableMap.getMap("payload") : null;
            if (readableMap.hasKey("callbackMetadata")) {
                readableMap.getMap("callbackMetadata");
            }
            String string2 = map != null ? map.getString("itemId") : null;
            ur7 formMode = rNProfileFormsModule.parseFormMode(string, string2);
            if (formMode instanceof ur7.b) {
                promise.resolve(rNProfileFormsModule.createNotImplementedResult("Suggestion mode not yet implemented"));
                return;
            }
            Activity currentActivity = rNProfileFormsModule.getReactApplicationContext().getCurrentActivity();
            g gVar = currentActivity instanceof g ? (g) currentActivity : null;
            if (gVar == null) {
                promise.resolve(rNProfileFormsModule.createErrorResult("Activity not available"));
                return;
            }
            lr5 lr5VarU = gVar.u();
            lr5VarU.getClass();
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            int i = 6;
            int i2 = 4;
            int i3 = 2;
            int i4 = 5;
            int i5 = 3;
            switch (lowerCase.hashCode()) {
                case -1857640538:
                    if (lowerCase.equals("summary")) {
                        ((vr7) cr8.p(vr7.class)).b(lr5VarU, new os7.g(null, new qa3(i4, promise, rNProfileFormsModule)), formMode);
                        return;
                    }
                    break;
                case -1595503908:
                    if (lowerCase.equals("jobtypes")) {
                        ((vr7) cr8.p(vr7.class)).a(lr5VarU, new gs7.d(null, new tn0(i, promise, rNProfileFormsModule)));
                        return;
                    }
                    break;
                case -1405038154:
                    if (lowerCase.equals("awards")) {
                        ((vr7) cr8.p(vr7.class)).e(lr5VarU, IndeedRNBridgeBaseProfileFormsNativeModule.MODULE_NAME, new ns7.a(null, new bb(i5, promise, rNProfileFormsModule)), formMode);
                        return;
                    }
                    break;
                case -1237460524:
                    if (lowerCase.equals("groups")) {
                        ((vr7) cr8.p(vr7.class)).e(lr5VarU, IndeedRNBridgeBaseProfileFormsNativeModule.MODULE_NAME, new ns7.d(null, new ug(i3, promise, rNProfileFormsModule)), formMode);
                        return;
                    }
                    break;
                case -1190933784:
                    if (lowerCase.equals("relocation")) {
                        ((vr7) cr8.p(vr7.class)).a(lr5VarU, new gs7.e(null, new gh(8, promise, rNProfileFormsModule)));
                        return;
                    }
                    break;
                case -1166886744:
                    if (lowerCase.equals("workschedule")) {
                        ((vr7) cr8.p(vr7.class)).a(lr5VarU, new gs7.h(null, new uc(i, promise, rNProfileFormsModule)));
                        return;
                    }
                    break;
                case -973344427:
                    if (lowerCase.equals("additionalinfo")) {
                        ((vr7) cr8.p(vr7.class)).b(lr5VarU, new os7.a(null, new qg(i5, promise, rNProfileFormsModule)), formMode);
                        return;
                    }
                    break;
                case -934610874:
                    if (lowerCase.equals("remote")) {
                        ((vr7) cr8.p(vr7.class)).a(lr5VarU, new gs7.f(null, new gu(i5, promise, rNProfileFormsModule)));
                        return;
                    }
                    break;
                case -900562878:
                    if (lowerCase.equals("skills")) {
                        if (formMode instanceof ur7.a) {
                            ((vr7) cr8.p(vr7.class)).b(lr5VarU, new os7.d(null, new n91(i2, promise, rNProfileFormsModule)), formMode);
                            return;
                        }
                        if ((formMode instanceof ur7.c) && string2 != null && string2.length() != 0) {
                            ((vr7) cr8.p(vr7.class)).b(lr5VarU, new os7.d(null, new xb(i4, promise, rNProfileFormsModule)), formMode);
                            return;
                        }
                        ((vr7) cr8.p(vr7.class)).b(lr5VarU, new os7.f(null, new iu(i3, promise, rNProfileFormsModule)), formMode);
                        return;
                    }
                    break;
                case -791528437:
                    if (lowerCase.equals("patents")) {
                        ((vr7) cr8.p(vr7.class)).e(lr5VarU, IndeedRNBridgeBaseProfileFormsNativeModule.MODULE_NAME, new ns7.g(null, new nn8(i5, promise, rNProfileFormsModule)), formMode);
                        return;
                    }
                    break;
                case -717397785:
                    if (lowerCase.equals("commutetime")) {
                        ((vr7) cr8.p(vr7.class)).a(lr5VarU, new gs7.a(null, new o61(i5, promise, rNProfileFormsModule)));
                        return;
                    }
                    break;
                case -383091238:
                    if (lowerCase.equals("minimumpay")) {
                        ((vr7) cr8.p(vr7.class)).a(lr5VarU, new gs7.b(null, new fu(i3, promise, rNProfileFormsModule)));
                        return;
                    }
                    break;
                case -290756696:
                    if (lowerCase.equals("education")) {
                        ((vr7) cr8.p(vr7.class)).e(lr5VarU, IndeedRNBridgeBaseProfileFormsNativeModule.MODULE_NAME, new ns7.c(null, new fs(i4, promise, rNProfileFormsModule)), formMode);
                        return;
                    }
                    break;
                case -258053394:
                    if (lowerCase.equals("personalinfo")) {
                        ((vr7) cr8.p(vr7.class)).b(lr5VarU, new os7.c(null, new d30(i5, promise, rNProfileFormsModule)), formMode);
                        return;
                    }
                    break;
                case -145519974:
                    if (lowerCase.equals("drivinglicense")) {
                        ((vr7) cr8.p(vr7.class)).c(lr5VarU, new rs7.b(new wj4(i4, promise, rNProfileFormsModule)), formMode);
                        return;
                    }
                    break;
                case -5038068:
                    if (lowerCase.equals("accountinglicense")) {
                        ((vr7) cr8.p(vr7.class)).c(lr5VarU, new rs7.a(new pu(i2, promise, rNProfileFormsModule)), formMode);
                        return;
                    }
                    break;
                case 102977465:
                    if (lowerCase.equals("links")) {
                        ((vr7) cr8.p(vr7.class)).e(lr5VarU, IndeedRNBridgeBaseProfileFormsNativeModule.MODULE_NAME, new ns7.e(null, new jd(7, promise, rNProfileFormsModule)), formMode);
                        return;
                    }
                    break;
                case 209796923:
                    if (lowerCase.equals("workexperience")) {
                        ((vr7) cr8.p(vr7.class)).e(lr5VarU, IndeedRNBridgeBaseProfileFormsNativeModule.MODULE_NAME, new ns7.i(null, new ku(i3, promise, rNProfileFormsModule)), formMode);
                        return;
                    }
                    break;
                case 471283303:
                    if (lowerCase.equals("nursinglicense")) {
                        ((vr7) cr8.p(vr7.class)).c(lr5VarU, new rs7.c(new kc(i2, promise, rNProfileFormsModule)), formMode);
                        return;
                    }
                    break;
                case 934847431:
                    if (lowerCase.equals("publications")) {
                        ((vr7) cr8.p(vr7.class)).e(lr5VarU, IndeedRNBridgeBaseProfileFormsNativeModule.MODULE_NAME, new ns7.h(null, new gs0(i5, promise, rNProfileFormsModule)), formMode);
                        return;
                    }
                    break;
                case 1092304149:
                    if (lowerCase.equals("workareas")) {
                        ((vr7) cr8.p(vr7.class)).a(lr5VarU, new gs7.g(null, new jh(9, promise, rNProfileFormsModule)));
                        return;
                    }
                    break;
                case 1260898568:
                    if (lowerCase.equals("militaryservice")) {
                        ((vr7) cr8.p(vr7.class)).e(lr5VarU, IndeedRNBridgeBaseProfileFormsNativeModule.MODULE_NAME, new ns7.f(null, new nu(i4, promise, rNProfileFormsModule)), formMode);
                        return;
                    }
                    break;
                case 1494565625:
                    if (lowerCase.equals("certifications")) {
                        ((vr7) cr8.p(vr7.class)).e(lr5VarU, IndeedRNBridgeBaseProfileFormsNativeModule.MODULE_NAME, new ns7.b(null, new ol1(i3, promise, rNProfileFormsModule)), formMode);
                        return;
                    }
                    break;
                case 1518327835:
                    if (lowerCase.equals("languages")) {
                        ((vr7) cr8.p(vr7.class)).b(lr5VarU, new os7.b(null, new tt2(promise, rNProfileFormsModule)), formMode);
                        return;
                    }
                    break;
                case 2064335640:
                    if (lowerCase.equals("jobtitles")) {
                        ((vr7) cr8.p(vr7.class)).a(lr5VarU, new gs7.c(null, new td(i2, promise, rNProfileFormsModule)));
                        return;
                    }
                    break;
                case 2142471281:
                    if (lowerCase.equals("skillset")) {
                        ((vr7) cr8.p(vr7.class)).b(lr5VarU, new os7.e(string2, new fq0(i4, promise, rNProfileFormsModule)), formMode);
                        return;
                    }
                    break;
            }
            promise.resolve(rNProfileFormsModule.createErrorResult("Unsupported section type: ".concat(str)));
        } catch (Exception e) {
            promise.resolve(rNProfileFormsModule.createErrorResult(l5.l("Error presenting form: ", e.getMessage())));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j6g presentNativeResumeOtherSectionForm$lambda$28$lambda$0(Promise promise, RNProfileFormsModule rNProfileFormsModule, ps7 ps7Var, fs7 fs7Var) {
        ps7Var.getClass();
        promise.resolve(rNProfileFormsModule.createResultMap(ps7Var, fs7Var));
        return j6g.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j6g presentNativeResumeOtherSectionForm$lambda$28$lambda$1(Promise promise, RNProfileFormsModule rNProfileFormsModule, ps7 ps7Var, ss7 ss7Var) {
        ps7Var.getClass();
        promise.resolve(rNProfileFormsModule.createResultMap(ps7Var, ss7Var));
        return j6g.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j6g presentNativeResumeOtherSectionForm$lambda$28$lambda$10(Promise promise, RNProfileFormsModule rNProfileFormsModule, ps7 ps7Var, qr7 qr7Var) {
        ps7Var.getClass();
        promise.resolve(rNProfileFormsModule.createResultMap(ps7Var, qr7Var));
        return j6g.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j6g presentNativeResumeOtherSectionForm$lambda$28$lambda$11(Promise promise, RNProfileFormsModule rNProfileFormsModule, ps7 ps7Var, pr7 pr7Var) {
        ps7Var.getClass();
        promise.resolve(rNProfileFormsModule.createResultMap(ps7Var, pr7Var));
        return j6g.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j6g presentNativeResumeOtherSectionForm$lambda$28$lambda$12(Promise promise, RNProfileFormsModule rNProfileFormsModule, ps7 ps7Var, xr7 xr7Var) {
        ps7Var.getClass();
        promise.resolve(rNProfileFormsModule.createResultMap(ps7Var, xr7Var));
        return j6g.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j6g presentNativeResumeOtherSectionForm$lambda$28$lambda$13(Promise promise, RNProfileFormsModule rNProfileFormsModule, ps7 ps7Var, zr7 zr7Var) {
        ps7Var.getClass();
        promise.resolve(rNProfileFormsModule.createResultMap(ps7Var, zr7Var));
        return j6g.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j6g presentNativeResumeOtherSectionForm$lambda$28$lambda$14(Promise promise, RNProfileFormsModule rNProfileFormsModule, ps7 ps7Var, bs7 bs7Var) {
        ps7Var.getClass();
        promise.resolve(rNProfileFormsModule.createResultMap(ps7Var, bs7Var));
        return j6g.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j6g presentNativeResumeOtherSectionForm$lambda$28$lambda$15(Promise promise, RNProfileFormsModule rNProfileFormsModule, ps7 ps7Var, es7 es7Var) {
        ps7Var.getClass();
        promise.resolve(rNProfileFormsModule.createResultMap(ps7Var, es7Var));
        return j6g.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j6g presentNativeResumeOtherSectionForm$lambda$28$lambda$16(Promise promise, RNProfileFormsModule rNProfileFormsModule, ps7 ps7Var, ks7 ks7Var) {
        ps7Var.getClass();
        promise.resolve(rNProfileFormsModule.createResultMap(ps7Var, ks7Var));
        return j6g.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j6g presentNativeResumeOtherSectionForm$lambda$28$lambda$17(Promise promise, RNProfileFormsModule rNProfileFormsModule, ps7 ps7Var) {
        ps7Var.getClass();
        promise.resolve(createResultMap$default(rNProfileFormsModule, ps7Var, (Object) null, 2, (Object) null));
        return j6g.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j6g presentNativeResumeOtherSectionForm$lambda$28$lambda$18(Promise promise, RNProfileFormsModule rNProfileFormsModule, ps7 ps7Var) {
        ps7Var.getClass();
        promise.resolve(createResultMap$default(rNProfileFormsModule, ps7Var, (Object) null, 2, (Object) null));
        return j6g.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j6g presentNativeResumeOtherSectionForm$lambda$28$lambda$19(Promise promise, RNProfileFormsModule rNProfileFormsModule, ps7 ps7Var) {
        ps7Var.getClass();
        promise.resolve(createResultMap$default(rNProfileFormsModule, ps7Var, (Object) null, 2, (Object) null));
        return j6g.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j6g presentNativeResumeOtherSectionForm$lambda$28$lambda$2(Promise promise, RNProfileFormsModule rNProfileFormsModule, ps7 ps7Var, qs7 qs7Var) {
        ps7Var.getClass();
        promise.resolve(rNProfileFormsModule.createResultMap(ps7Var, qs7Var));
        return j6g.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j6g presentNativeResumeOtherSectionForm$lambda$28$lambda$20(Promise promise, RNProfileFormsModule rNProfileFormsModule, hs7 hs7Var, as7 as7Var) {
        hs7Var.getClass();
        promise.resolve(rNProfileFormsModule.createResultMap(hs7Var, as7Var));
        return j6g.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j6g presentNativeResumeOtherSectionForm$lambda$28$lambda$21(Promise promise, RNProfileFormsModule rNProfileFormsModule, hs7 hs7Var, is7 is7Var) {
        hs7Var.getClass();
        promise.resolve(rNProfileFormsModule.createResultMap(hs7Var, is7Var));
        return j6g.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j6g presentNativeResumeOtherSectionForm$lambda$28$lambda$22(Promise promise, RNProfileFormsModule rNProfileFormsModule, hs7 hs7Var, cs7 cs7Var) {
        hs7Var.getClass();
        promise.resolve(rNProfileFormsModule.createResultMap(hs7Var, cs7Var));
        return j6g.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j6g presentNativeResumeOtherSectionForm$lambda$28$lambda$23(Promise promise, RNProfileFormsModule rNProfileFormsModule, hs7 hs7Var, js7 js7Var) {
        hs7Var.getClass();
        promise.resolve(rNProfileFormsModule.createResultMap(hs7Var, js7Var));
        return j6g.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j6g presentNativeResumeOtherSectionForm$lambda$28$lambda$24(Promise promise, RNProfileFormsModule rNProfileFormsModule, hs7 hs7Var, ls7 ls7Var) {
        hs7Var.getClass();
        promise.resolve(rNProfileFormsModule.createResultMap(hs7Var, ls7Var));
        return j6g.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j6g presentNativeResumeOtherSectionForm$lambda$28$lambda$25(Promise promise, RNProfileFormsModule rNProfileFormsModule, hs7 hs7Var, xs7 xs7Var) {
        hs7Var.getClass();
        promise.resolve(rNProfileFormsModule.createResultMap(hs7Var, xs7Var));
        return j6g.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j6g presentNativeResumeOtherSectionForm$lambda$28$lambda$26(Promise promise, RNProfileFormsModule rNProfileFormsModule, hs7 hs7Var, ws7 ws7Var) {
        hs7Var.getClass();
        promise.resolve(rNProfileFormsModule.createResultMap(hs7Var, ws7Var));
        return j6g.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j6g presentNativeResumeOtherSectionForm$lambda$28$lambda$27(Promise promise, RNProfileFormsModule rNProfileFormsModule, hs7 hs7Var, us7 us7Var) {
        hs7Var.getClass();
        promise.resolve(rNProfileFormsModule.createResultMap(hs7Var, us7Var));
        return j6g.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j6g presentNativeResumeOtherSectionForm$lambda$28$lambda$3(Promise promise, RNProfileFormsModule rNProfileFormsModule, ps7 ps7Var, qs7 qs7Var) {
        ps7Var.getClass();
        promise.resolve(rNProfileFormsModule.createResultMap(ps7Var, qs7Var));
        return j6g.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j6g presentNativeResumeOtherSectionForm$lambda$28$lambda$4(Promise promise, RNProfileFormsModule rNProfileFormsModule, ps7 ps7Var, List list) {
        ps7Var.getClass();
        promise.resolve(rNProfileFormsModule.createResultMap(ps7Var, list));
        return j6g.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j6g presentNativeResumeOtherSectionForm$lambda$28$lambda$5(Promise promise, RNProfileFormsModule rNProfileFormsModule, ps7 ps7Var, yr7 yr7Var) {
        ps7Var.getClass();
        promise.resolve(rNProfileFormsModule.createResultMap(ps7Var, yr7Var));
        return j6g.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j6g presentNativeResumeOtherSectionForm$lambda$28$lambda$6(Promise promise, RNProfileFormsModule rNProfileFormsModule, ps7 ps7Var, or7 or7Var) {
        ps7Var.getClass();
        promise.resolve(rNProfileFormsModule.createResultMap(ps7Var, or7Var));
        return j6g.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j6g presentNativeResumeOtherSectionForm$lambda$28$lambda$7(Promise promise, RNProfileFormsModule rNProfileFormsModule, ps7 ps7Var, List list) {
        ps7Var.getClass();
        promise.resolve(rNProfileFormsModule.createResultMap(ps7Var, list));
        return j6g.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j6g presentNativeResumeOtherSectionForm$lambda$28$lambda$8(Promise promise, RNProfileFormsModule rNProfileFormsModule, ps7 ps7Var, vs7 vs7Var) {
        ps7Var.getClass();
        promise.resolve(rNProfileFormsModule.createResultMap(ps7Var, vs7Var));
        return j6g.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j6g presentNativeResumeOtherSectionForm$lambda$28$lambda$9(Promise promise, RNProfileFormsModule rNProfileFormsModule, ps7 ps7Var, tr7 tr7Var) {
        ps7Var.getClass();
        promise.resolve(rNProfileFormsModule.createResultMap(ps7Var, tr7Var));
        return j6g.a;
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseProfileFormsNativeModule
    @ReactMethod
    public void presentNativeResumeOtherSectionForm(final String sectionType, final ReadableMap options, final Promise promise) {
        sectionType.getClass();
        options.getClass();
        promise.getClass();
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: dec
            @Override // java.lang.Runnable
            public final void run() {
                RNProfileFormsModule.presentNativeResumeOtherSectionForm$lambda$28(options, promise, this, sectionType);
            }
        });
    }

    public static /* synthetic */ WritableMap createResultMap$default(RNProfileFormsModule rNProfileFormsModule, hs7 hs7Var, Object obj, int i, Object obj2) {
        if ((i & 2) != 0) {
            obj = null;
        }
        return rNProfileFormsModule.createResultMap(hs7Var, obj);
    }

    private final WritableMap createResultMap(hs7 result, Object data) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.getClass();
        writableMapCreateMap.putBoolean("success", result != hs7.d);
        writableMapCreateMap.putString("result", result.name());
        if (data != null) {
            writableMapCreateMap.putString("data", data.toString());
        }
        return writableMapCreateMap;
    }
}

package defpackage;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.uimanager.BaseViewManager;

/* JADX INFO: loaded from: classes2.dex */
public final class bfc extends o81 {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bfc(BaseViewManager baseViewManager, int i) {
        super(baseViewManager);
        this.d = i;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.o81, defpackage.sqg
    /* JADX INFO: renamed from: m */
    public final void a(View view, String str, Object obj) {
        BaseViewManager baseViewManager;
        switch (this.d) {
            case 0:
                baseViewManager = (BaseViewManager) this.c;
                str.getClass();
                switch (str) {
                    case "translucent":
                        ((cfc) baseViewManager).setTranslucent(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                        break;
                    case "titleColor":
                        ((cfc) baseViewManager).setTitleColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                        break;
                    case "blurEffect":
                        ((cfc) baseViewManager).setBlurEffect(view, (String) obj);
                        break;
                    case "largeTitleColor":
                        ((cfc) baseViewManager).setLargeTitleColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                        break;
                    case "titleFontFamily":
                        ((cfc) baseViewManager).setTitleFontFamily(view, obj != null ? (String) obj : null);
                        break;
                    case "disableBackButtonMenu":
                        ((cfc) baseViewManager).setDisableBackButtonMenu(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                        break;
                    case "titleFontWeight":
                        ((cfc) baseViewManager).setTitleFontWeight(view, obj != null ? (String) obj : null);
                        break;
                    case "hidden":
                        ((cfc) baseViewManager).setHidden(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                        break;
                    case "largeTitleFontSize":
                        ((cfc) baseViewManager).setLargeTitleFontSize(view, obj != null ? ((Double) obj).intValue() : 0);
                        break;
                    case "backButtonDisplayMode":
                        ((cfc) baseViewManager).setBackButtonDisplayMode(view, (String) obj);
                        break;
                    case "backTitleVisible":
                        ((cfc) baseViewManager).setBackTitleVisible(view, obj != null ? ((Boolean) obj).booleanValue() : true);
                        break;
                    case "direction":
                        ((cfc) baseViewManager).setDirection(view, (String) obj);
                        break;
                    case "largeTitleBackgroundColor":
                        ((cfc) baseViewManager).setLargeTitleBackgroundColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                        break;
                    case "backButtonInCustomView":
                        ((cfc) baseViewManager).setBackButtonInCustomView(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                        break;
                    case "largeTitleFontFamily":
                        ((cfc) baseViewManager).setLargeTitleFontFamily(view, obj != null ? (String) obj : null);
                        break;
                    case "color":
                        ((cfc) baseViewManager).setColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                        break;
                    case "title":
                        ((cfc) baseViewManager).setTitle(view, obj != null ? (String) obj : null);
                        break;
                    case "backTitleFontSize":
                        ((cfc) baseViewManager).setBackTitleFontSize(view, obj != null ? ((Double) obj).intValue() : 0);
                        break;
                    case "backTitleFontFamily":
                        ((cfc) baseViewManager).setBackTitleFontFamily(view, obj != null ? (String) obj : null);
                        break;
                    case "hideShadow":
                        ((cfc) baseViewManager).setHideShadow(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                        break;
                    case "largeTitleFontWeight":
                        ((cfc) baseViewManager).setLargeTitleFontWeight(view, obj != null ? (String) obj : null);
                        break;
                    case "hideBackButton":
                        ((cfc) baseViewManager).setHideBackButton(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                        break;
                    case "backgroundColor":
                        ((cfc) baseViewManager).setBackgroundColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                        break;
                    case "backTitle":
                        ((cfc) baseViewManager).setBackTitle(view, obj != null ? (String) obj : null);
                        break;
                    case "titleFontSize":
                        ((cfc) baseViewManager).setTitleFontSize(view, obj != null ? ((Double) obj).intValue() : 0);
                        break;
                    case "largeTitleHideShadow":
                        ((cfc) baseViewManager).setLargeTitleHideShadow(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                        break;
                    case "largeTitle":
                        ((cfc) baseViewManager).setLargeTitle(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                        break;
                    case "topInsetEnabled":
                        ((cfc) baseViewManager).setTopInsetEnabled(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                        break;
                    default:
                        super.a(view, str, obj);
                        break;
                }
                break;
            default:
                BaseViewManager baseViewManager2 = (BaseViewManager) this.c;
                str.getClass();
                switch (str.hashCode()) {
                    case -1567958285:
                        if (!str.equals("vbHeight")) {
                        }
                        break;
                    case -1274492040:
                        if (!str.equals("filter")) {
                        }
                        break;
                    case -1267206133:
                        if (!str.equals("opacity")) {
                        }
                        break;
                    case -1081239615:
                        if (!str.equals("matrix")) {
                        }
                        break;
                    case -993894751:
                        if (!str.equals("propList")) {
                        }
                        break;
                    case -933864895:
                        if (!str.equals("markerEnd")) {
                        }
                        break;
                    case -933857362:
                        if (!str.equals("markerMid")) {
                        }
                        break;
                    case -891980232:
                        if (!str.equals("stroke")) {
                        }
                        break;
                    case -734428249:
                        if (!str.equals("fontWeight")) {
                        }
                        break;
                    case -729118945:
                        if (!str.equals("fillRule")) {
                        }
                        break;
                    case -416535885:
                        if (!str.equals("strokeOpacity")) {
                        }
                        break;
                    case -293492298:
                        if (!str.equals("pointerEvents")) {
                        }
                        break;
                    case -53677816:
                        if (!str.equals("fillOpacity")) {
                        }
                        break;
                    case -44578051:
                        if (!str.equals("strokeDashoffset")) {
                        }
                        break;
                    case 3143043:
                        if (!str.equals("fill")) {
                        }
                        break;
                    case 3148879:
                        if (!str.equals("font")) {
                        }
                        break;
                    case 3344108:
                        if (!str.equals("mask")) {
                        }
                        break;
                    case 3351622:
                        if (!str.equals("minX")) {
                        }
                        break;
                    case 3351623:
                        if (!str.equals("minY")) {
                        }
                        break;
                    case 3373707:
                        if (!str.equals("name")) {
                        }
                        break;
                    case 78845486:
                        if (!str.equals("strokeMiterlimit")) {
                        }
                        break;
                    case 92903173:
                        if (!str.equals("align")) {
                        }
                        break;
                    case 94842723:
                        if (!str.equals("color")) {
                        }
                        break;
                    case 104482996:
                        if (!str.equals("vectorEffect")) {
                        }
                        break;
                    case 217109576:
                        if (!str.equals("markerStart")) {
                        }
                        break;
                    case 240482938:
                        if (!str.equals("vbWidth")) {
                        }
                        break;
                    case 365601008:
                        if (!str.equals("fontSize")) {
                        }
                        break;
                    case 401643183:
                        if (!str.equals("strokeDasharray")) {
                        }
                        break;
                    case 917656469:
                        if (!str.equals("clipPath")) {
                        }
                        break;
                    case 917735020:
                        if (!str.equals("clipRule")) {
                        }
                        break;
                    case 1027575302:
                        if (!str.equals("strokeLinecap")) {
                        }
                        break;
                    case 1671764162:
                        if (!str.equals("display")) {
                        }
                        break;
                    case 1790285174:
                        if (!str.equals("strokeLinejoin")) {
                        }
                        break;
                    case 1847674614:
                        if (!str.equals("responsible")) {
                        }
                        break;
                    case 1908075304:
                        if (!str.equals("meetOrSlice")) {
                        }
                        break;
                    case 1924065902:
                        if (!str.equals("strokeWidth")) {
                        }
                        break;
                    default:
                        break;
                }
                /*  JADX ERROR: Method code generation error
                    java.lang.NullPointerException: Switch insn not found in header
                    	at java.base/java.util.Objects.requireNonNull(Objects.java:248)
                    	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:246)
                    	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:88)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:267)
                    	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:88)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:305)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:284)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:412)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:337)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:303)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    */
                /*
                    Method dump skipped, instruction units count: 2396
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.bfc.a(android.view.View, java.lang.String, java.lang.Object):void");
            }
        }

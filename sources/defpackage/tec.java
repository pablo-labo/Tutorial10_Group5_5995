package defpackage;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.uimanager.BaseViewManager;

/* JADX INFO: loaded from: classes2.dex */
public final class tec extends o81 {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tec(BaseViewManager baseViewManager, int i) {
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
                    case "tabBarTintColor":
                        ((uec) baseViewManager).setTabBarTintColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                        break;
                    case "tabBarItemLabelVisibilityMode":
                        ((uec) baseViewManager).setTabBarItemLabelVisibilityMode(view, (String) obj);
                        break;
                    case "tabBarItemIconColor":
                        ((uec) baseViewManager).setTabBarItemIconColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                        break;
                    case "tabBarItemActiveIndicatorColor":
                        ((uec) baseViewManager).setTabBarItemActiveIndicatorColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                        break;
                    case "tabBarItemTitleFontColorActive":
                        ((uec) baseViewManager).setTabBarItemTitleFontColorActive(view, ColorPropConverter.getColor(obj, view.getContext()));
                        break;
                    case "tabBarBackgroundColor":
                        ((uec) baseViewManager).setTabBarBackgroundColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                        break;
                    case "tabBarItemTitleFontSize":
                        ((uec) baseViewManager).setTabBarItemTitleFontSize(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                        break;
                    case "tabBarItemTitleFontColor":
                        ((uec) baseViewManager).setTabBarItemTitleFontColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                        break;
                    case "tabBarItemTitleFontStyle":
                        ((uec) baseViewManager).setTabBarItemTitleFontStyle(view, obj != null ? (String) obj : null);
                        break;
                    case "tabBarMinimizeBehavior":
                        ((uec) baseViewManager).setTabBarMinimizeBehavior(view, (String) obj);
                        break;
                    case "tabBarItemActiveIndicatorEnabled":
                        ((uec) baseViewManager).setTabBarItemActiveIndicatorEnabled(view, obj != null ? ((Boolean) obj).booleanValue() : true);
                        break;
                    case "tabBarItemIconColorActive":
                        ((uec) baseViewManager).setTabBarItemIconColorActive(view, ColorPropConverter.getColor(obj, view.getContext()));
                        break;
                    case "controlNavigationStateInJS":
                        ((uec) baseViewManager).setControlNavigationStateInJS(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                        break;
                    case "tabBarItemTitleFontFamily":
                        ((uec) baseViewManager).setTabBarItemTitleFontFamily(view, obj != null ? (String) obj : null);
                        break;
                    case "tabBarItemRippleColor":
                        ((uec) baseViewManager).setTabBarItemRippleColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                        break;
                    case "tabBarItemTitleFontWeight":
                        ((uec) baseViewManager).setTabBarItemTitleFontWeight(view, obj != null ? (String) obj : null);
                        break;
                    case "tabBarItemTitleFontSizeActive":
                        ((uec) baseViewManager).setTabBarItemTitleFontSizeActive(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
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
                    case 100:
                        if (!str.equals("d")) {
                        }
                        break;
                    case 3143043:
                        if (!str.equals("fill")) {
                        }
                        break;
                    case 3344108:
                        if (!str.equals("mask")) {
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
                    Method dump skipped, instruction units count: 1676
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.tec.a(android.view.View, java.lang.String, java.lang.Object):void");
            }
        }

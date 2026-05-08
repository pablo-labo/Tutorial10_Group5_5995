package defpackage;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.BaseViewManager;

/* JADX INFO: loaded from: classes2.dex */
public final class mw9 extends o81 {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mw9(BaseViewManager baseViewManager, int i) {
        super(baseViewManager);
        this.d = i;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.o81, defpackage.sqg
    /* JADX INFO: renamed from: m */
    public final void a(View view, String str, Object obj) {
        BaseViewManager baseViewManager;
        BaseViewManager baseViewManager2;
        switch (this.d) {
            case 0:
                baseViewManager = (BaseViewManager) this.c;
                str.getClass();
                switch (str) {
                    case "presentationStyle":
                        ((nw9) baseViewManager).setPresentationStyle(view, (String) obj);
                        break;
                    case "supportedOrientations":
                        ((nw9) baseViewManager).setSupportedOrientations(view, (ReadableArray) obj);
                        break;
                    case "transparent":
                        ((nw9) baseViewManager).setTransparent(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                        break;
                    case "identifier":
                        ((nw9) baseViewManager).setIdentifier(view, obj != null ? ((Double) obj).intValue() : 0);
                        break;
                    case "statusBarTranslucent":
                        ((nw9) baseViewManager).setStatusBarTranslucent(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                        break;
                    case "allowSwipeDismissal":
                        ((nw9) baseViewManager).setAllowSwipeDismissal(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                        break;
                    case "animated":
                        ((nw9) baseViewManager).setAnimated(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                        break;
                    case "visible":
                        ((nw9) baseViewManager).setVisible(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                        break;
                    case "navigationBarTranslucent":
                        ((nw9) baseViewManager).setNavigationBarTranslucent(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                        break;
                    case "hardwareAccelerated":
                        ((nw9) baseViewManager).setHardwareAccelerated(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                        break;
                    case "animationType":
                        ((nw9) baseViewManager).setAnimationType(view, (String) obj);
                        break;
                    default:
                        super.a(view, str, obj);
                        break;
                }
                break;
            case 1:
                BaseViewManager baseViewManager3 = (BaseViewManager) this.c;
                str.getClass();
                switch (str.hashCode()) {
                    case -2143114526:
                        if (!str.equals("rippleRadius")) {
                        }
                        break;
                    case -1609594047:
                        if (!str.equals("enabled")) {
                        }
                        break;
                    case -775297261:
                        if (!str.equals("rippleColor")) {
                        }
                        break;
                    case 722830999:
                        if (!str.equals("borderColor")) {
                        }
                        break;
                    case 737768677:
                        if (!str.equals("borderStyle")) {
                        }
                        break;
                    case 741115130:
                        if (!str.equals("borderWidth")) {
                        }
                        break;
                    case 1387411372:
                        if (!str.equals("touchSoundDisabled")) {
                        }
                        break;
                    case 1686617758:
                        if (!str.equals("exclusive")) {
                        }
                        break;
                    case 1825644485:
                        if (!str.equals("borderless")) {
                        }
                        break;
                    case 1984457027:
                        if (!str.equals("foreground")) {
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
                    Method dump skipped, instruction units count: 962
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.mw9.a(android.view.View, java.lang.String, java.lang.Object):void");
            }
        }

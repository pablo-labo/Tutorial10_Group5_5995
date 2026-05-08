package defpackage;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.BaseViewManager;

/* JADX INFO: loaded from: classes2.dex */
public final class ja0 extends o81 {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ja0(BaseViewManager baseViewManager, int i) {
        super(baseViewManager);
        this.d = i;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.o81, defpackage.sqg
    /* JADX INFO: renamed from: m */
    public final void a(View view, String str, Object obj) {
        View.OnLayoutChangeListener onLayoutChangeListener;
        switch (this.d) {
            case 0:
                onLayoutChangeListener = (BaseViewManager) this.c;
                str.getClass();
                switch (str) {
                    case "thumbColor":
                        ((ka0) onLayoutChangeListener).setThumbColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                        break;
                    case "enabled":
                        ((ka0) onLayoutChangeListener).setEnabled(view, obj != null ? ((Boolean) obj).booleanValue() : true);
                        break;
                    case "trackTintColor":
                        ((ka0) onLayoutChangeListener).setTrackTintColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                        break;
                    case "on":
                        ((ka0) onLayoutChangeListener).setOn(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                        break;
                    case "value":
                        ((ka0) onLayoutChangeListener).setValue(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                        break;
                    case "disabled":
                        ((ka0) onLayoutChangeListener).setDisabled(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                        break;
                    case "trackColorForFalse":
                        ((ka0) onLayoutChangeListener).setTrackColorForFalse(view, ColorPropConverter.getColor(obj, view.getContext()));
                        break;
                    case "thumbTintColor":
                        ((ka0) onLayoutChangeListener).setThumbTintColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                        break;
                    case "trackColorForTrue":
                        ((ka0) onLayoutChangeListener).setTrackColorForTrue(view, ColorPropConverter.getColor(obj, view.getContext()));
                        break;
                    default:
                        super.a(view, str, obj);
                        break;
                }
                break;
            default:
                View.OnLayoutChangeListener onLayoutChangeListener2 = (BaseViewManager) this.c;
                str.getClass();
                switch (str.hashCode()) {
                    case -1221029593:
                        if (!str.equals("height")) {
                        }
                        break;
                    case -934426595:
                        if (!str.equals("result")) {
                        }
                        break;
                    case 120:
                        if (!str.equals("x")) {
                        }
                        break;
                    case 121:
                        if (!str.equals("y")) {
                        }
                        break;
                    case 104364:
                        if (!str.equals("in1")) {
                        }
                        break;
                    case 104365:
                        if (!str.equals("in2")) {
                        }
                        break;
                    case 3357091:
                        if (!str.equals("mode")) {
                        }
                        break;
                    case 113126854:
                        if (!str.equals("width")) {
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
                    Method dump skipped, instruction units count: 588
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.ja0.a(android.view.View, java.lang.String, java.lang.Object):void");
            }

            @Override // defpackage.o81, defpackage.sqg
            /* JADX INFO: renamed from: s */
            public void f(View view, String str, ReadableArray readableArray) {
                switch (this.d) {
                    case 0:
                        str.getClass();
                        if (str.equals("setNativeValue")) {
                            ((ka0) ((BaseViewManager) this.c)).setNativeValue(view, readableArray.getBoolean(0));
                            break;
                        }
                        break;
                    default:
                        super.f(view, str, readableArray);
                        break;
                }
            }
        }

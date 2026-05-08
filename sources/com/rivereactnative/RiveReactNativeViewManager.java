package com.rivereactnative;

import app.rive.runtime.kotlin.RiveAnimationView;
import app.rive.runtime.kotlin.controllers.RiveFileController;
import app.rive.runtime.kotlin.core.Artboard;
import app.rive.runtime.kotlin.core.Direction;
import app.rive.runtime.kotlin.core.LinearAnimationInstance;
import app.rive.runtime.kotlin.core.Loop;
import app.rive.runtime.kotlin.core.RiveTextValueRun;
import app.rive.runtime.kotlin.core.StateMachineInstance;
import app.rive.runtime.kotlin.core.errors.RiveException;
import app.rive.runtime.kotlin.renderers.PointerEvents;
import app.rive.runtime.kotlin.renderers.RiveArtboardRenderer;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.SimpleViewManager;
import com.rivereactnative.c;
import com.rivereactnative.e;
import com.rivereactnative.j;
import defpackage.anc;
import defpackage.gb9;
import defpackage.j6g;
import defpackage.l;
import defpackage.mkf;
import defpackage.s6;
import defpackage.snc;
import defpackage.wl7;
import defpackage.z92;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J)\u0010\b\u001a\u001c\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0007\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0019\u0010\u0018J!\u0010\u001b\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001e\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001e\u0010\u001cJ\u001f\u0010!\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001fH\u0007¢\u0006\u0004\b!\u0010\"J\u001f\u0010$\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u0006H\u0007¢\u0006\u0004\b$\u0010\u001cJ!\u0010&\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00022\b\u0010%\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b&\u0010\u001cJ\u001f\u0010)\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010(\u001a\u00020'H\u0007¢\u0006\u0004\b)\u0010*J\u001f\u0010,\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010+\u001a\u00020\u0006H\u0007¢\u0006\u0004\b,\u0010\u001cJ\u001f\u0010.\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010-\u001a\u00020\u0006H\u0007¢\u0006\u0004\b.\u0010\u001cJ!\u00101\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00022\b\u00100\u001a\u0004\u0018\u00010/H\u0007¢\u0006\u0004\b1\u00102J!\u00103\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00022\b\u00100\u001a\u0004\u0018\u00010/H\u0007¢\u0006\u0004\b3\u00102J\u001f\u00105\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00022\u0006\u00104\u001a\u00020\u0006H\u0007¢\u0006\u0004\b5\u0010\u001cJ\u001f\u00107\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00022\u0006\u00106\u001a\u00020'H\u0007¢\u0006\u0004\b7\u0010*¨\u00068"}, d2 = {"Lcom/rivereactnative/RiveReactNativeViewManager;", "Lcom/facebook/react/uimanager/SimpleViewManager;", "Lcom/rivereactnative/j;", "<init>", "()V", "", "", "", "getExportedCustomDirectEventTypeConstants", "()Ljava/util/Map;", "getName", "()Ljava/lang/String;", "view", "commandId", "Lcom/facebook/react/bridge/ReadableArray;", "args", "Lj6g;", "receiveCommand", "(Lcom/rivereactnative/j;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V", "Lmkf;", "reactContext", "createViewInstance", "(Lmkf;)Lcom/rivereactnative/j;", "onDropViewInstance", "(Lcom/rivereactnative/j;)V", "onAfterUpdateTransaction", "resourceName", "setResourceName", "(Lcom/rivereactnative/j;Ljava/lang/String;)V", "fit", "setFit", "", "layoutScaleFactor", "setLayoutScaleFactor", "(Lcom/rivereactnative/j;D)V", "alignment", "setAlignment", "url", "setUrl", "", "autoplay", "setAutoplay", "(Lcom/rivereactnative/j;Z)V", "artboardName", "setArtboardName", "animationName", "setAnimationName", "Lcom/facebook/react/bridge/ReadableMap;", "source", "setReferencedAssets", "(Lcom/rivereactnative/j;Lcom/facebook/react/bridge/ReadableMap;)V", "setDataBinding", "stateMachineName", "setStateMachineName", "isUserHandlingErrors", "setIsUserHandlingErrors", "rive-react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RiveReactNativeViewManager extends SimpleViewManager<j> {
    @Override // com.facebook.react.uimanager.ViewManager
    public j createViewInstance(mkf reactContext) {
        reactContext.getClass();
        return new j(reactContext);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Map<String, String>> getExportedCustomDirectEventTypeConstants() {
        HashMap map = new HashMap();
        for (j.c cVar : j.c.values()) {
            map.put(cVar.toString(), gb9.a("registrationName", cVar.toString()));
        }
        return new LinkedHashMap(map);
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RiveReactNativeView";
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(j view) {
        view.getClass();
        super.onAfterUpdateTransaction(view);
        view.x();
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(j view) {
        view.getClass();
        view.g0 = true;
        super.onDropViewInstance(view);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(j view, String commandId, ReadableArray args) {
        RiveFileController controller;
        Artboard activeArtboard;
        RiveTextValueRun riveTextValueRunTextRun;
        RiveFileController controller2;
        RiveFileController controller3;
        RiveFileController controller4;
        Artboard activeArtboard2;
        RiveTextValueRun riveTextValueRunTextRun2;
        Loop loop;
        Direction direction;
        HashSet<StateMachineInstance> playingStateMachines;
        HashSet<LinearAnimationInstance> playingAnimations;
        anc ancVar;
        anc ancVar2;
        RiveArtboardRenderer artboardRenderer;
        view.getClass();
        commandId.getClass();
        switch (commandId.hashCode()) {
            case -1993641967:
                if (commandId.equals("setNumberPropertyValue") && args != null) {
                    String string = args.getString(0);
                    string.getClass();
                    view.s(string, (float) args.getDouble(1));
                }
                break;
            case -1862062441:
                if (commandId.equals("fireTriggerProperty") && args != null) {
                    String string2 = args.getString(0);
                    string2.getClass();
                    view.e(string2);
                }
                break;
            case -1685235450:
                if (commandId.equals("setNumberState") && args != null) {
                    String string3 = args.getString(0);
                    string3.getClass();
                    String string4 = args.getString(1);
                    string4.getClass();
                    float f = (float) args.getDouble(2);
                    try {
                        anc ancVar3 = view.b;
                        if (ancVar3 != null) {
                            ancVar3.setNumberState(string3, string4, f);
                        }
                    } catch (RiveException e) {
                        view.f(e);
                        return;
                    }
                }
                break;
            case -1670524211:
                if (commandId.equals("setTextRunValueAtPath") && args != null) {
                    String string5 = args.getString(0);
                    string5.getClass();
                    String string6 = args.getString(1);
                    string6.getClass();
                    String string7 = args.getString(2);
                    string7.getClass();
                    try {
                        anc ancVar4 = view.b;
                        if (ancVar4 != null && (controller = ancVar4.getController()) != null && (activeArtboard = controller.getActiveArtboard()) != null && (riveTextValueRunTextRun = activeArtboard.textRun(string5, string7)) != null) {
                            riveTextValueRunTextRun.setText(string6);
                            break;
                        }
                    } catch (RiveException e2) {
                        view.f(e2);
                        return;
                    }
                }
                break;
            case -1624287310:
                if (commandId.equals("touchBegan") && args != null) {
                    float f2 = (float) args.getDouble(0);
                    float f3 = (float) args.getDouble(1);
                    anc ancVar5 = view.b;
                    if (ancVar5 != null && (controller2 = ancVar5.getController()) != null) {
                        controller2.pointerEvent(PointerEvents.POINTER_DOWN, f2, f3);
                        break;
                    }
                }
                break;
            case -1621251397:
                if (commandId.equals("touchEnded") && args != null) {
                    float f4 = (float) args.getDouble(0);
                    float f5 = (float) args.getDouble(1);
                    anc ancVar6 = view.b;
                    if (ancVar6 != null && (controller3 = ancVar6.getController()) != null) {
                        controller3.pointerEvent(PointerEvents.POINTER_UP, f4, f5);
                        break;
                    }
                }
                break;
            case -1218674827:
                if (commandId.equals("setTextRunValue") && args != null) {
                    String string8 = args.getString(0);
                    string8.getClass();
                    String string9 = args.getString(1);
                    string9.getClass();
                    try {
                        anc ancVar7 = view.b;
                        if (ancVar7 != null && (controller4 = ancVar7.getController()) != null && (activeArtboard2 = controller4.getActiveArtboard()) != null && (riveTextValueRunTextRun2 = activeArtboard2.textRun(string8)) != null) {
                            riveTextValueRunTextRun2.setText(string9);
                            break;
                        }
                    } catch (RiveException e3) {
                        view.f(e3);
                        return;
                    }
                }
                break;
            case -1153467490:
                if (commandId.equals("setNumberStateAtPath") && args != null) {
                    String string10 = args.getString(0);
                    string10.getClass();
                    double d = args.getDouble(1);
                    String string11 = args.getString(2);
                    string11.getClass();
                    float f6 = (float) d;
                    try {
                        anc ancVar8 = view.b;
                        if (ancVar8 != null) {
                            ancVar8.setNumberStateAtPath(string10, f6, string11);
                        }
                    } catch (RiveException e4) {
                        view.f(e4);
                        return;
                    }
                }
                break;
            case -1152045460:
                if (commandId.equals("registerPropertyListener") && args != null) {
                    String string12 = args.getString(0);
                    string12.getClass();
                    String string13 = args.getString(1);
                    string13.getClass();
                    view.m(string12, string13);
                }
                break;
            case -297316357:
                if (commandId.equals("fireState") && args != null) {
                    String string14 = args.getString(0);
                    string14.getClass();
                    String string15 = args.getString(1);
                    string15.getClass();
                    try {
                        anc ancVar9 = view.b;
                        if (ancVar9 != null) {
                            ancVar9.fireState(string14, string15);
                        }
                    } catch (RiveException e5) {
                        view.f(e5);
                        return;
                    }
                }
                break;
            case -251704925:
                if (commandId.equals("setBooleanStateAtPath") && args != null) {
                    String string16 = args.getString(0);
                    string16.getClass();
                    boolean z = args.getBoolean(1);
                    String string17 = args.getString(2);
                    string17.getClass();
                    try {
                        anc ancVar10 = view.b;
                        if (ancVar10 != null) {
                            ancVar10.setBooleanStateAtPath(string16, z, string17);
                        }
                    } catch (RiveException e6) {
                        view.f(e6);
                        return;
                    }
                }
                break;
            case -76877751:
                if (commandId.equals("setStringPropertyValue") && args != null) {
                    String string18 = args.getString(0);
                    string18.getClass();
                    String string19 = args.getString(1);
                    string19.getClass();
                    view.t(string18, string19);
                }
                break;
            case 3443508:
                if (commandId.equals("play") && args != null) {
                    String string20 = args.getString(0);
                    string20.getClass();
                    String string21 = args.getString(1);
                    string21.getClass();
                    String string22 = args.getString(2);
                    string22.getClass();
                    boolean z2 = args.getBoolean(3);
                    e.a aVar = e.a;
                    aVar.getClass();
                    for (e eVar : e.values()) {
                        if (wl7.b(eVar.toString(), string21)) {
                            e eVarValueOf = e.valueOf(eVar.name());
                            c.a aVar2 = c.a;
                            aVar2.getClass();
                            for (c cVar : c.values()) {
                                if (wl7.b(cVar.toString(), string22)) {
                                    c cVarValueOf = c.valueOf(cVar.name());
                                    eVarValueOf.getClass();
                                    cVarValueOf.getClass();
                                    aVar.getClass();
                                    int iOrdinal = eVarValueOf.ordinal();
                                    if (iOrdinal == 0) {
                                        loop = Loop.ONESHOT;
                                    } else if (iOrdinal == 1) {
                                        loop = Loop.LOOP;
                                    } else if (iOrdinal == 2) {
                                        loop = Loop.PINGPONG;
                                    } else if (iOrdinal != 3) {
                                        l.g();
                                    } else {
                                        loop = Loop.AUTO;
                                    }
                                    Loop loop2 = loop;
                                    aVar2.getClass();
                                    int iOrdinal2 = cVarValueOf.ordinal();
                                    if (iOrdinal2 == 0) {
                                        direction = Direction.BACKWARDS;
                                    } else if (iOrdinal2 == 1) {
                                        direction = Direction.AUTO;
                                    } else if (iOrdinal2 != 2) {
                                        l.g();
                                    } else {
                                        direction = Direction.FORWARDS;
                                    }
                                    Direction direction2 = direction;
                                    int length = string20.length();
                                    anc ancVar11 = view.b;
                                    if (length == 0) {
                                        if (ancVar11 != null) {
                                            RiveAnimationView.play$default(ancVar11, loop2, direction2, false, 4, null);
                                        }
                                    } else if (ancVar11 != null) {
                                        try {
                                            RiveAnimationView.play$default((RiveAnimationView) ancVar11, string20, loop2, direction2, z2, false, 16, (Object) null);
                                            j6g j6gVar = j6g.a;
                                        } catch (RiveException e7) {
                                            view.f(e7);
                                            j6g j6gVar2 = j6g.a;
                                            return;
                                        }
                                    }
                                }
                                break;
                            }
                            s6.j("Array contains no element matching the predicate.");
                        }
                        break;
                    }
                    s6.j("Array contains no element matching the predicate.");
                }
                break;
            case 3540994:
                if (commandId.equals("stop")) {
                    try {
                        anc ancVar12 = view.b;
                        if (ancVar12 != null) {
                            ancVar12.stop();
                        }
                    } catch (RiveException e8) {
                        view.f(e8);
                        return;
                    }
                    break;
                }
                break;
            case 106440182:
                if (commandId.equals("pause")) {
                    try {
                        anc ancVar13 = view.b;
                        if (ancVar13 == null || (playingAnimations = ancVar13.getPlayingAnimations()) == null || !(!playingAnimations.isEmpty())) {
                            anc ancVar14 = view.b;
                            if (ancVar14 == null || (playingStateMachines = ancVar14.getPlayingStateMachines()) == null || !(!playingStateMachines.isEmpty())) {
                                anc ancVar15 = view.b;
                                if (ancVar15 != null) {
                                    ancVar15.pause();
                                }
                            } else {
                                anc ancVar16 = view.b;
                                ancVar16.getClass();
                                anc ancVar17 = view.b;
                                ancVar17.getClass();
                                ancVar16.pause(((StateMachineInstance) z92.N0(ancVar17.getPlayingStateMachines())).getName(), true);
                            }
                        } else {
                            anc ancVar18 = view.b;
                            ancVar18.getClass();
                            anc ancVar19 = view.b;
                            ancVar19.getClass();
                            RiveAnimationView.pause$default((RiveAnimationView) ancVar18, ((LinearAnimationInstance) z92.N0(ancVar19.getPlayingAnimations())).getName(), false, 2, (Object) null);
                        }
                    } catch (RiveException e9) {
                        view.f(e9);
                        return;
                    }
                    break;
                }
                break;
            case 108404047:
                if (commandId.equals("reset")) {
                    String str = view.e;
                    int i = view.d;
                    if (str == null) {
                        if (i != -1 && (ancVar = view.b) != null) {
                            ancVar.reset();
                            break;
                        }
                    } else if (i == -1 && (ancVar2 = view.b) != null && (artboardRenderer = ancVar2.getArtboardRenderer()) != null) {
                        artboardRenderer.reset();
                        break;
                    }
                }
                break;
            case 495466713:
                if (commandId.equals("setEnumPropertyValue") && args != null) {
                    String string23 = args.getString(0);
                    string23.getClass();
                    String string24 = args.getString(1);
                    string24.getClass();
                    view.r(string23, string24);
                }
                break;
            case 1014998739:
                if (commandId.equals("fireStateAtPath") && args != null) {
                    String string25 = args.getString(0);
                    string25.getClass();
                    String string26 = args.getString(1);
                    string26.getClass();
                    try {
                        anc ancVar20 = view.b;
                        if (ancVar20 != null) {
                            ancVar20.fireStateAtPath(string25, string26);
                        }
                    } catch (RiveException e10) {
                        view.f(e10);
                        return;
                    }
                }
                break;
            case 1311756502:
                if (commandId.equals("setBooleanPropertyValue") && args != null) {
                    String string27 = args.getString(0);
                    string27.getClass();
                    view.p(string27, args.getBoolean(1));
                }
                break;
            case 1331650043:
                if (commandId.equals("setColorPropertyValue") && args != null) {
                    String string28 = args.getString(0);
                    string28.getClass();
                    view.q(string28, (int) args.getDouble(1), (int) args.getDouble(2), (int) args.getDouble(3), (int) args.getDouble(4));
                }
                break;
            case 1487752907:
                if (commandId.equals("setBooleanState") && args != null) {
                    String string29 = args.getString(0);
                    string29.getClass();
                    String string30 = args.getString(1);
                    string30.getClass();
                    boolean z3 = args.getBoolean(2);
                    try {
                        anc ancVar21 = view.b;
                        if (ancVar21 != null) {
                            ancVar21.setBooleanState(string29, string30, z3);
                        }
                    } catch (RiveException e11) {
                        view.f(e11);
                        return;
                    }
                }
                break;
        }
    }

    @snc(name = "alignment")
    public final void setAlignment(j view, String alignment) {
        view.getClass();
        alignment.getClass();
        b.a.getClass();
        for (b bVar : b.values()) {
            if (wl7.b(bVar.toString(), alignment)) {
                view.setAlignment(b.valueOf(bVar.name()));
                return;
            }
        }
        s6.j("Array contains no element matching the predicate.");
    }

    @snc(name = "animationName")
    public final void setAnimationName(j view, String animationName) {
        view.getClass();
        animationName.getClass();
        view.setAnimationName(animationName);
    }

    @snc(name = "artboardName")
    public final void setArtboardName(j view, String artboardName) {
        view.getClass();
        artboardName.getClass();
        view.setArtboardName(artboardName);
    }

    @snc(name = "autoplay")
    public final void setAutoplay(j view, boolean autoplay) {
        view.getClass();
        view.setAutoplay(autoplay);
    }

    @snc(name = "dataBinding")
    public final void setDataBinding(j view, ReadableMap source) {
        view.getClass();
        view.setDataBinding(source);
    }

    @snc(name = "fit")
    public final void setFit(j view, String fit) {
        view.getClass();
        fit.getClass();
        d.a.getClass();
        for (d dVar : d.values()) {
            if (wl7.b(dVar.toString(), fit)) {
                view.setFit(d.valueOf(dVar.name()));
                return;
            }
        }
        s6.j("Array contains no element matching the predicate.");
    }

    @snc(name = "isUserHandlingErrors")
    public final void setIsUserHandlingErrors(j view, boolean isUserHandlingErrors) {
        view.getClass();
        view.setIsUserHandlingErrors(isUserHandlingErrors);
    }

    @snc(name = "layoutScaleFactor")
    public final void setLayoutScaleFactor(j view, double layoutScaleFactor) {
        view.getClass();
        if (Double.isNaN(layoutScaleFactor) || layoutScaleFactor <= 0.0d) {
            view.setLayoutScaleFactor(null);
        } else {
            view.setLayoutScaleFactor(Float.valueOf((float) layoutScaleFactor));
        }
    }

    @snc(name = "referencedAssets")
    public final void setReferencedAssets(j view, ReadableMap source) throws Throwable {
        view.getClass();
        view.setReferencedAssets(source);
    }

    @snc(name = "resourceName")
    public final void setResourceName(j view, String resourceName) {
        view.getClass();
        view.setResourceName(resourceName);
    }

    @snc(name = "stateMachineName")
    public final void setStateMachineName(j view, String stateMachineName) {
        view.getClass();
        stateMachineName.getClass();
        view.setStateMachineName(stateMachineName);
    }

    @snc(name = "url")
    public final void setUrl(j view, String url) {
        view.getClass();
        view.setUrl(url);
    }
}

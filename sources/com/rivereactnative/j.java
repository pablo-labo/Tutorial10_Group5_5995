package com.rivereactnative;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.widget.FrameLayout;
import app.rive.runtime.kotlin.RiveAnimationView;
import app.rive.runtime.kotlin.controllers.RiveFileController;
import app.rive.runtime.kotlin.core.Alignment;
import app.rive.runtime.kotlin.core.Artboard;
import app.rive.runtime.kotlin.core.AudioAsset;
import app.rive.runtime.kotlin.core.File;
import app.rive.runtime.kotlin.core.FileAsset;
import app.rive.runtime.kotlin.core.Fit;
import app.rive.runtime.kotlin.core.FontAsset;
import app.rive.runtime.kotlin.core.ImageAsset;
import app.rive.runtime.kotlin.core.LinearAnimationInstance;
import app.rive.runtime.kotlin.core.Loop;
import app.rive.runtime.kotlin.core.PlayableInstance;
import app.rive.runtime.kotlin.core.RefCount;
import app.rive.runtime.kotlin.core.RiveAudio;
import app.rive.runtime.kotlin.core.RiveEvent;
import app.rive.runtime.kotlin.core.RiveFont;
import app.rive.runtime.kotlin.core.RiveGeneralEvent;
import app.rive.runtime.kotlin.core.RiveOpenURLEvent;
import app.rive.runtime.kotlin.core.RiveRenderImage;
import app.rive.runtime.kotlin.core.StateMachineInstance;
import app.rive.runtime.kotlin.core.ViewModel;
import app.rive.runtime.kotlin.core.ViewModelBooleanProperty;
import app.rive.runtime.kotlin.core.ViewModelColorProperty;
import app.rive.runtime.kotlin.core.ViewModelEnumProperty;
import app.rive.runtime.kotlin.core.ViewModelInstance;
import app.rive.runtime.kotlin.core.ViewModelNumberProperty;
import app.rive.runtime.kotlin.core.ViewModelProperty;
import app.rive.runtime.kotlin.core.ViewModelStringProperty;
import app.rive.runtime.kotlin.core.ViewModelTriggerProperty;
import app.rive.runtime.kotlin.core.errors.AnimationException;
import app.rive.runtime.kotlin.core.errors.ArtboardException;
import app.rive.runtime.kotlin.core.errors.MalformedFileException;
import app.rive.runtime.kotlin.core.errors.RiveException;
import app.rive.runtime.kotlin.core.errors.StateMachineException;
import app.rive.runtime.kotlin.core.errors.StateMachineInputException;
import app.rive.runtime.kotlin.core.errors.TextValueRunException;
import app.rive.runtime.kotlin.core.errors.UnsupportedRuntimeVersionException;
import app.rive.runtime.kotlin.core.errors.ViewModelException;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.rivereactnative.a;
import com.rivereactnative.e;
import com.rivereactnative.j;
import defpackage.a74;
import defpackage.aed;
import defpackage.anc;
import defpackage.bnc;
import defpackage.c1f;
import defpackage.e13;
import defpackage.eu2;
import defpackage.f13;
import defpackage.h4c;
import defpackage.itg;
import defpackage.j6g;
import defpackage.l;
import defpackage.l5;
import defpackage.l6d;
import defpackage.lu2;
import defpackage.mkf;
import defpackage.nc9;
import defpackage.p6;
import defpackage.r6;
import defpackage.s6;
import defpackage.sec;
import defpackage.ti9;
import defpackage.u63;
import defpackage.uh3;
import defpackage.wi5;
import defpackage.wl7;
import defpackage.yv8;
import defpackage.z92;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"ViewConstructor"})
public final class j extends FrameLayout {
    public static final /* synthetic */ int n0 = 0;
    public String V;
    public String W;
    public final mkf a;
    public Fit a0;
    public anc b;
    public Alignment b0;
    public String c;
    public boolean c0;
    public int d;
    public ReadableMap d0;
    public String e;
    public boolean e0;
    public String f;
    public boolean f0;
    public boolean g0;
    public final a h0;
    public final b i0;
    public i j0;
    public final eu2 k0;
    public com.rivereactnative.a l0;
    public final LinkedHashMap m0;

    public static final class a implements RiveFileController.Listener {
        public a() {
        }

        @Override // app.rive.runtime.kotlin.controllers.RiveFileController.Listener
        public final void notifyAdvance(float f) {
            RiveFileController.Listener.DefaultImpls.notifyAdvance(this, f);
        }

        @Override // app.rive.runtime.kotlin.controllers.RiveFileController.Listener
        public final void notifyLoop(PlayableInstance playableInstance) {
            com.rivereactnative.e eVar;
            playableInstance.getClass();
            if (!(playableInstance instanceof LinearAnimationInstance)) {
                l5.q("Only animation can be passed as an argument");
                return;
            }
            LinearAnimationInstance linearAnimationInstance = (LinearAnimationInstance) playableInstance;
            String name = linearAnimationInstance.getName();
            Loop loop = linearAnimationInstance.getLoop();
            com.rivereactnative.e.a.getClass();
            loop.getClass();
            int i = e.a.C0191a.a[loop.ordinal()];
            if (i == 1) {
                eVar = com.rivereactnative.e.OneShot;
            } else if (i == 2) {
                eVar = com.rivereactnative.e.Loop;
            } else if (i == 3) {
                eVar = com.rivereactnative.e.PingPong;
            } else {
                if (i != 4) {
                    l.g();
                    return;
                }
                eVar = com.rivereactnative.e.Auto;
            }
            name.getClass();
            j jVar = j.this;
            mkf mkfVar = jVar.a;
            mkfVar.getClass();
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.getClass();
            writableMapCreateMap.putString("animationName", name);
            writableMapCreateMap.putString("loopMode", eVar.toString());
            ((RCTEventEmitter) mkfVar.getJSModule(RCTEventEmitter.class)).receiveEvent(jVar.getId(), c.LOOP_END.toString(), writableMapCreateMap);
        }

        @Override // app.rive.runtime.kotlin.controllers.RiveFileController.Listener
        public final void notifyPause(PlayableInstance playableInstance) {
            playableInstance.getClass();
            boolean z = playableInstance instanceof LinearAnimationInstance;
            j jVar = j.this;
            if (z) {
                jVar.h(((LinearAnimationInstance) playableInstance).getName(), false);
            }
            if (playableInstance instanceof StateMachineInstance) {
                jVar.h(((StateMachineInstance) playableInstance).getName(), true);
            }
        }

        @Override // app.rive.runtime.kotlin.controllers.RiveFileController.Listener
        public final void notifyPlay(PlayableInstance playableInstance) {
            playableInstance.getClass();
            boolean z = playableInstance instanceof LinearAnimationInstance;
            j jVar = j.this;
            if (z) {
                jVar.i(((LinearAnimationInstance) playableInstance).getName(), false);
            }
            if (playableInstance instanceof StateMachineInstance) {
                jVar.i(((StateMachineInstance) playableInstance).getName(), true);
            }
        }

        @Override // app.rive.runtime.kotlin.controllers.RiveFileController.Listener
        public final void notifyStateChanged(String str, String str2) {
            str.getClass();
            str2.getClass();
            j jVar = j.this;
            mkf mkfVar = jVar.a;
            mkfVar.getClass();
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.getClass();
            writableMapCreateMap.putString("stateMachineName", str);
            writableMapCreateMap.putString("stateName", str2);
            ((RCTEventEmitter) mkfVar.getJSModule(RCTEventEmitter.class)).receiveEvent(jVar.getId(), c.STATE_CHANGED.toString(), writableMapCreateMap);
        }

        @Override // app.rive.runtime.kotlin.controllers.RiveFileController.Listener
        public final void notifyStop(PlayableInstance playableInstance) {
            playableInstance.getClass();
            boolean z = playableInstance instanceof LinearAnimationInstance;
            j jVar = j.this;
            if (z) {
                jVar.k(((LinearAnimationInstance) playableInstance).getName(), false);
            }
            if (playableInstance instanceof StateMachineInstance) {
                jVar.k(((StateMachineInstance) playableInstance).getName(), true);
            }
        }
    }

    public static final class b implements RiveFileController.RiveEventListener {
        public b() {
        }

        @Override // app.rive.runtime.kotlin.controllers.RiveFileController.RiveEventListener
        public final void notifyEvent(RiveEvent riveEvent) {
            riveEvent.getClass();
            boolean z = riveEvent instanceof RiveGeneralEvent;
            j jVar = j.this;
            if (z) {
                jVar.j(riveEvent);
            } else if (riveEvent instanceof RiveOpenURLEvent) {
                jVar.j(riveEvent);
            }
        }
    }

    public enum c {
        PLAY("onPlay"),
        PAUSE("onPause"),
        STOP("onStop"),
        LOOP_END("onLoopEnd"),
        STATE_CHANGED("onStateChanged"),
        RIVE_EVENT("onRiveEventReceived"),
        ERROR("onError");

        private final String mName;

        c(String str) {
            this.mName = str;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return this.mName;
        }
    }

    public /* synthetic */ class d {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[f.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[5] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[4] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[ReadableType.values().length];
            try {
                iArr2[ReadableType.Null.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[ReadableType.Boolean.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[ReadableType.Number.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[ReadableType.String.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[ReadableType.Map.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[ReadableType.Array.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            a = iArr2;
        }
    }

    @uh3(c = "com.rivereactnative.RiveReactNativeView$registerPropertyListener$job$1", f = "RiveReactNativeView.kt", l = {462, 467}, m = "invokeSuspend")
    public static final class e extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ String $key;
        final /* synthetic */ ViewModelProperty<? extends Object> $property;
        final /* synthetic */ f $propertyTypeEnum;
        int label;
        final /* synthetic */ j this$0;

        public static final class a<T> implements wi5 {
            public final /* synthetic */ j a;
            public final /* synthetic */ String b;

            public a(j jVar, String str) {
                this.a = jVar;
                this.b = str;
            }

            @Override // defpackage.wi5
            public final Object a(Object obj, lu2<? super j6g> lu2Var) {
                int i = j.n0;
                this.a.o(this.b, null);
                return j6g.a;
            }
        }

        public static final class b<T> implements wi5 {
            public final /* synthetic */ j a;
            public final /* synthetic */ String b;

            public b(j jVar, String str) {
                this.a = jVar;
                this.b = str;
            }

            @Override // defpackage.wi5
            public final Object a(Object obj, lu2<? super j6g> lu2Var) {
                int i = j.n0;
                this.a.o(this.b, obj);
                return j6g.a;
            }
        }

        public /* synthetic */ class c {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[f.values().length];
                try {
                    iArr[4] = 1;
                } catch (NoSuchFieldError unused) {
                }
                a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(f fVar, ViewModelProperty<? extends Object> viewModelProperty, j jVar, String str, lu2<? super e> lu2Var) {
            super(2, lu2Var);
            this.$propertyTypeEnum = fVar;
            this.$property = viewModelProperty;
            this.this$0 = jVar;
            this.$key = str;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new e(this.$propertyTypeEnum, this.$property, this.this$0, this.$key, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((e) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0043, code lost:
        
            if (r7.e(r0, r6) == r4) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x005c, code lost:
        
            if (r7.e(r0, r6) == r4) goto L19;
         */
        @Override // defpackage.x81
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                int r0 = r6.label
                r1 = 0
                r2 = 2
                r3 = 1
                if (r0 == 0) goto L19
                if (r0 == r3) goto L15
                if (r0 == r2) goto L11
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.r6.g(r6)
                return r1
            L11:
                defpackage.r7d.b(r7)
                goto L5f
            L15:
                defpackage.r7d.b(r7)
                goto L46
            L19:
                defpackage.r7d.b(r7)
                com.rivereactnative.f r7 = r6.$propertyTypeEnum
                int[] r0 = com.rivereactnative.j.e.c.a
                int r7 = r7.ordinal()
                r7 = r0[r7]
                app.rive.runtime.kotlin.core.ViewModelProperty<? extends java.lang.Object> r0 = r6.$property
                g13 r4 = defpackage.g13.a
                if (r7 != r3) goto L49
                fse r7 = r0.getValueFlow()
                sj5 r7 = defpackage.wg2.w(r7, r3)
                com.rivereactnative.j$e$a r0 = new com.rivereactnative.j$e$a
                com.rivereactnative.j r1 = r6.this$0
                java.lang.String r2 = r6.$key
                r0.<init>(r1, r2)
                r6.label = r3
                java.lang.Object r6 = r7.e(r0, r6)
                if (r6 != r4) goto L46
                goto L5e
            L46:
                j6g r6 = defpackage.j6g.a
                return r6
            L49:
                fse r7 = r0.getValueFlow()
                com.rivereactnative.j$e$b r0 = new com.rivereactnative.j$e$b
                com.rivereactnative.j r3 = r6.this$0
                java.lang.String r5 = r6.$key
                r0.<init>(r3, r5)
                r6.label = r2
                java.lang.Object r6 = r7.e(r0, r6)
                if (r6 != r4) goto L5f
            L5e:
                return r4
            L5f:
                defpackage.r40.e()
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.rivereactnative.j.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public j(mkf mkfVar) {
        super(mkfVar);
        this.a = mkfVar;
        this.d = -1;
        this.a0 = Fit.CONTAIN;
        this.b0 = Alignment.CENTER;
        this.e0 = true;
        this.k0 = f13.a(a74.a);
        this.m0 = new LinkedHashMap();
        anc ancVar = new anc(mkfVar, null, 2, 0 == true ? 1 : 0);
        this.b = ancVar;
        a aVar = new a();
        this.h0 = aVar;
        b bVar = new b();
        this.i0 = bVar;
        ancVar.registerListener((RiveFileController.Listener) aVar);
        anc ancVar2 = this.b;
        if (ancVar2 != null) {
            ancVar2.addEventListener(bVar);
        }
        this.c0 = false;
        addView(this.b);
    }

    public static void a(j jVar, boolean z, byte[] bArr) {
        try {
            anc ancVar = jVar.b;
            if (ancVar != null) {
                bArr.getClass();
                Fit fit = jVar.a0;
                Alignment alignment = jVar.b0;
                boolean shouldAutoBind = jVar.getShouldAutoBind();
                String str = jVar.V;
                RiveAnimationView.setRiveBytes$default(ancVar, bArr, jVar.W, jVar.f, str, z, shouldAutoBind, fit, alignment, null, IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER, null);
            }
            jVar.b();
            jVar.o(jVar.getLoadedTag(), null);
        } catch (RiveException e2) {
            jVar.f(e2);
        }
    }

    public static final void c(j jVar, ViewModelInstance viewModelInstance) {
        RiveFileController controller;
        Artboard activeArtboard;
        RiveFileController controller2;
        List<StateMachineInstance> stateMachines;
        StateMachineInstance stateMachineInstance;
        anc ancVar = jVar.b;
        if (ancVar != null && (controller2 = ancVar.getController()) != null && (stateMachines = controller2.getStateMachines()) != null && (stateMachineInstance = (StateMachineInstance) z92.O0(stateMachines)) != null) {
            stateMachineInstance.setViewModelInstance(viewModelInstance);
        }
        anc ancVar2 = jVar.b;
        if (ancVar2 != null && (controller = ancVar2.getController()) != null && (activeArtboard = controller.getActiveArtboard()) != null) {
            activeArtboard.setViewModelInstance(viewModelInstance);
        }
        Iterator it = nc9.j0(jVar.m0).iterator();
        while (it.hasNext()) {
            h4c h4cVar = (h4c) ((Pair) it.next()).b();
            if (h4cVar.a != viewModelInstance) {
                jVar.m(h4cVar.b, h4cVar.c);
            }
        }
    }

    private final String getLoadedTag() {
        return p6.c(getId(), "RiveReactNativeLoaded:");
    }

    private final boolean getShouldAutoBind() {
        com.rivereactnative.a aVar = this.l0;
        return (aVar instanceof a.C0190a) && ((a.C0190a) aVar).a;
    }

    private final ViewModelInstance getViewModelInstance() {
        RiveFileController controller;
        Artboard activeArtboard;
        anc ancVar = this.b;
        if (ancVar == null || (controller = ancVar.getController()) == null || (activeArtboard = controller.getActiveArtboard()) == null) {
            return null;
        }
        return activeArtboard.getViewModelInstance();
    }

    public static void l(FileAsset fileAsset, byte[] bArr) {
        if (fileAsset instanceof ImageAsset) {
            ((ImageAsset) fileAsset).setImage(RiveRenderImage.Companion.make$default(RiveRenderImage.INSTANCE, bArr, null, 2, null));
            return;
        }
        if (fileAsset instanceof FontAsset) {
            ((FontAsset) fileAsset).setFont(RiveFont.Companion.make$default(RiveFont.INSTANCE, bArr, null, 2, null));
        } else if (fileAsset instanceof AudioAsset) {
            ((AudioAsset) fileAsset).setAudio(RiveAudio.Companion.make$default(RiveAudio.INSTANCE, bArr, null, 2, null));
        } else {
            l.g();
        }
    }

    public static void u(Exception exc, String str) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.getClass();
        writableMapCreateMap.putString("message", str);
        if (exc != null) {
            StackTraceElement[] stackTrace = exc.getStackTrace();
            stackTrace.getClass();
            WritableArray writableArrayCreateArray = Arguments.createArray();
            writableArrayCreateArray.getClass();
            for (StackTraceElement stackTraceElement : stackTrace) {
                WritableMap writableMapCreateMap2 = Arguments.createMap();
                writableMapCreateMap2.getClass();
                writableMapCreateMap2.putString("methodName", stackTraceElement.getMethodName());
                writableMapCreateMap2.putInt("lineNumber", stackTraceElement.getLineNumber());
                writableMapCreateMap2.putString("file", stackTraceElement.getFileName());
                writableArrayCreateArray.pushMap(writableMapCreateMap2);
            }
            writableMapCreateMap.putArray("stack", writableArrayCreateArray);
        }
    }

    public static ArrayList v(ReadableArray readableArray) {
        ArrayList arrayList = new ArrayList();
        int size = readableArray.size();
        for (int i = 0; i < size; i++) {
            switch (d.a[readableArray.getType(i).ordinal()]) {
                case 1:
                    arrayList.add(null);
                    break;
                case 2:
                    arrayList.add(Boolean.valueOf(readableArray.getBoolean(i)));
                    break;
                case 3:
                    arrayList.add(Double.valueOf(readableArray.getDouble(i)));
                    break;
                case 4:
                    arrayList.add(readableArray.getString(i));
                    break;
                case 5:
                    ReadableMap map = readableArray.getMap(i);
                    arrayList.add(map != null ? w(map) : null);
                    break;
                case 6:
                    ReadableArray array = readableArray.getArray(i);
                    arrayList.add(array != null ? v(array) : null);
                    break;
                default:
                    l5.q(p6.c(i, "Unsupported array type at index: "));
                    return null;
            }
        }
        return arrayList;
    }

    public static LinkedHashMap w(ReadableMap readableMap) {
        readableMap.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = readableMap.keySetIterator();
        while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
            switch (d.a[readableMap.getType(strNextKey).ordinal()]) {
                case 1:
                    linkedHashMap.put(strNextKey, null);
                    break;
                case 2:
                    linkedHashMap.put(strNextKey, Boolean.valueOf(readableMap.getBoolean(strNextKey)));
                    break;
                case 3:
                    linkedHashMap.put(strNextKey, Double.valueOf(readableMap.getDouble(strNextKey)));
                    break;
                case 4:
                    linkedHashMap.put(strNextKey, readableMap.getString(strNextKey));
                    break;
                case 5:
                    ReadableMap map = readableMap.getMap(strNextKey);
                    linkedHashMap.put(strNextKey, map != null ? w(map) : null);
                    break;
                case 6:
                    ReadableArray array = readableMap.getArray(strNextKey);
                    linkedHashMap.put(strNextKey, array != null ? v(array) : null);
                    break;
                default:
                    l5.q(l5.l("Unsupported type for key: ", strNextKey));
                    return null;
            }
        }
        return linkedHashMap;
    }

    public final void b() {
        RiveFileController controller;
        File file;
        anc ancVar;
        RiveFileController controller2;
        Artboard activeArtboard;
        try {
            anc ancVar2 = this.b;
            if (ancVar2 != null && (controller = ancVar2.getController()) != null && (file = controller.getFile()) != null && (ancVar = this.b) != null && (controller2 = ancVar.getController()) != null && (activeArtboard = controller2.getActiveArtboard()) != null) {
                ViewModel viewModelDefaultViewModelForArtboard = file.defaultViewModelForArtboard(activeArtboard);
                com.rivereactnative.a aVar = this.l0;
                if (aVar instanceof a.C0190a) {
                    this.e0 = true;
                    return;
                }
                if (aVar instanceof a.c) {
                    c(this, viewModelDefaultViewModelForArtboard.createInstanceFromIndex(((a.c) aVar).a));
                    return;
                }
                if (aVar instanceof a.d) {
                    c(this, viewModelDefaultViewModelForArtboard.createInstanceFromName(((a.d) aVar).a));
                } else if (aVar instanceof a.b) {
                    c(this, viewModelDefaultViewModelForArtboard.createBlankInstance());
                } else if (aVar != null) {
                    throw new NoWhenBranchMatchedException();
                }
            }
        } catch (RiveException e2) {
            f(e2);
        } catch (Exception e3) {
            u(e3, "Unexpected error during data binding configuration");
        }
    }

    public final void d(String str, l6d.b<byte[]> bVar) {
        try {
            new URL(str);
            itg.a(this.a).a(new sec(str, bVar, new ti9(this, str)));
        } catch (MalformedURLException unused) {
            if (!this.f0) {
                u(null, "Invalid URL: " + str);
            } else {
                g gVar = g.IncorrectRiveFileUrl;
                gVar.c("Invalid URL: " + str);
                n(gVar);
            }
        }
    }

    public final void e(String str) {
        ViewModelTriggerProperty triggerProperty;
        try {
            ViewModelInstance viewModelInstance = getViewModelInstance();
            if (viewModelInstance == null || (triggerProperty = viewModelInstance.getTriggerProperty(str)) == null) {
                return;
            }
            triggerProperty.trigger();
        } catch (RiveException e2) {
            f(e2);
        }
    }

    public final void f(RiveException riveException) {
        g gVar;
        if (!this.f0) {
            u(riveException, String.valueOf(riveException.getMessage()));
            return;
        }
        g.a.getClass();
        if (riveException instanceof ArtboardException) {
            String message = riveException.getMessage();
            message.getClass();
            gVar = g.IncorrectArtboardName;
            gVar.c(message);
        } else if (riveException instanceof UnsupportedRuntimeVersionException) {
            String message2 = riveException.getMessage();
            message2.getClass();
            gVar = g.UnsupportedRuntimeVersion;
            gVar.c(message2);
        } else if (riveException instanceof MalformedFileException) {
            String message3 = riveException.getMessage();
            message3.getClass();
            gVar = g.MalformedFile;
            gVar.c(message3);
        } else if (riveException instanceof AnimationException) {
            String message4 = riveException.getMessage();
            message4.getClass();
            gVar = g.IncorrectAnimationName;
            gVar.c(message4);
        } else if (riveException instanceof StateMachineException) {
            String message5 = riveException.getMessage();
            message5.getClass();
            gVar = g.IncorrectStateMachineName;
            gVar.c(message5);
        } else if (riveException instanceof StateMachineInputException) {
            String message6 = riveException.getMessage();
            message6.getClass();
            gVar = g.IncorrectStateMachineInput;
            gVar.c(message6);
        } else if (riveException instanceof TextValueRunException) {
            String message7 = riveException.getMessage();
            message7.getClass();
            gVar = g.TextRunNotFoundError;
            gVar.c(message7);
        } else if (riveException instanceof ViewModelException) {
            String message8 = riveException.getMessage();
            message8.getClass();
            gVar = g.DataBindingError;
            gVar.c(message8);
        } else {
            gVar = null;
        }
        if (gVar != null) {
            n(gVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(com.facebook.react.bridge.ReadableMap r9, app.rive.runtime.kotlin.core.FileAsset r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 291
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.rivereactnative.j.g(com.facebook.react.bridge.ReadableMap, app.rive.runtime.kotlin.core.FileAsset):void");
    }

    public final void h(String str, boolean z) {
        str.getClass();
        mkf mkfVar = this.a;
        mkfVar.getClass();
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.getClass();
        writableMapCreateMap.putString("animationName", str);
        writableMapCreateMap.putBoolean("isStateMachine", z);
        ((RCTEventEmitter) mkfVar.getJSModule(RCTEventEmitter.class)).receiveEvent(getId(), c.PAUSE.toString(), writableMapCreateMap);
    }

    public final void i(String str, boolean z) {
        str.getClass();
        mkf mkfVar = this.a;
        mkfVar.getClass();
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.getClass();
        writableMapCreateMap.putString("animationName", str);
        writableMapCreateMap.putBoolean("isStateMachine", z);
        ((RCTEventEmitter) mkfVar.getJSModule(RCTEventEmitter.class)).receiveEvent(getId(), c.PLAY.toString(), writableMapCreateMap);
    }

    public final void j(RiveEvent riveEvent) {
        mkf mkfVar = this.a;
        mkfVar.getClass();
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.getClass();
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        writableMapCreateMap2.putString("name", riveEvent.getName());
        writableMapCreateMap2.putDouble("delay", riveEvent.getDelay());
        HashMap<String, Object> properties = riveEvent.getProperties();
        WritableMap writableMapCreateMap3 = Arguments.createMap();
        writableMapCreateMap3.getClass();
        for (Map.Entry<String, Object> entry : properties.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof String) {
                writableMapCreateMap3.putString(key, (String) value);
            } else if (value instanceof Integer) {
                writableMapCreateMap3.putInt(key, ((Number) value).intValue());
            } else if (value instanceof Float) {
                writableMapCreateMap3.putDouble(key, ((Number) value).floatValue());
            } else if (value instanceof Double) {
                writableMapCreateMap3.putDouble(key, ((Number) value).doubleValue());
            } else if (value instanceof Boolean) {
                writableMapCreateMap3.putBoolean(key, ((Boolean) value).booleanValue());
            }
        }
        writableMapCreateMap2.putMap("properties", writableMapCreateMap3);
        if (riveEvent instanceof RiveOpenURLEvent) {
            RiveOpenURLEvent riveOpenURLEvent = (RiveOpenURLEvent) riveEvent;
            writableMapCreateMap2.putString("url", riveOpenURLEvent.getUrl());
            writableMapCreateMap2.putString("target", riveOpenURLEvent.getTarget());
        }
        writableMapCreateMap.putMap("riveEvent", writableMapCreateMap2);
        ((RCTEventEmitter) mkfVar.getJSModule(RCTEventEmitter.class)).receiveEvent(getId(), c.RIVE_EVENT.toString(), writableMapCreateMap);
    }

    public final void k(String str, boolean z) {
        str.getClass();
        mkf mkfVar = this.a;
        mkfVar.getClass();
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.getClass();
        writableMapCreateMap.putString("animationName", str);
        writableMapCreateMap.putBoolean("isStateMachine", z);
        ((RCTEventEmitter) mkfVar.getJSModule(RCTEventEmitter.class)).receiveEvent(getId(), c.STOP.toString(), writableMapCreateMap);
    }

    public final void m(String str, String str2) {
        j jVar;
        RiveException riveException;
        ViewModelProperty numberProperty;
        String str3 = str2 + ":" + str + ":" + getId();
        LinkedHashMap linkedHashMap = this.m0;
        h4c h4cVar = (h4c) linkedHashMap.get(str3);
        if (h4cVar != null) {
            h4cVar.d.h(null);
        }
        linkedHashMap.remove(str3);
        f.a.getClass();
        for (f fVar : f.c) {
            if (wl7.b(fVar.toString(), str2)) {
                f fVarValueOf = f.valueOf(fVar.name());
                try {
                    try {
                        ViewModelInstance viewModelInstance = getViewModelInstance();
                        if (viewModelInstance == null) {
                            return;
                        }
                        int iOrdinal = fVarValueOf.ordinal();
                        if (iOrdinal != 0) {
                            try {
                                if (iOrdinal == 1) {
                                    numberProperty = viewModelInstance.getStringProperty(str);
                                } else if (iOrdinal == 2) {
                                    numberProperty = viewModelInstance.getBooleanProperty(str);
                                } else if (iOrdinal == 3) {
                                    numberProperty = viewModelInstance.getColorProperty(str);
                                } else if (iOrdinal == 4) {
                                    numberProperty = viewModelInstance.getTriggerProperty(str);
                                } else {
                                    if (iOrdinal != 5) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    numberProperty = viewModelInstance.getEnumProperty(str);
                                }
                            } catch (RiveException e2) {
                                riveException = e2;
                                jVar = this;
                            }
                        } else {
                            numberProperty = viewModelInstance.getNumberProperty(str);
                        }
                        jVar = this;
                        try {
                            linkedHashMap.put(str3, new h4c(viewModelInstance, str, str2, u63.Y(this.k0, null, null, new e(fVarValueOf, numberProperty, jVar, str3, null), 3)));
                            return;
                        } catch (RiveException e3) {
                            e = e3;
                        }
                    } catch (RiveException e4) {
                        e = e4;
                        jVar = this;
                    }
                    riveException = e;
                    jVar.f(riveException);
                    return;
                } catch (Exception e5) {
                    u(e5, "Unexpected error during data binding configuration");
                    return;
                }
            }
        }
        s6.j("Collection contains no element matching the predicate.");
    }

    public final void n(g gVar) {
        mkf mkfVar = this.a;
        mkfVar.getClass();
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.getClass();
        writableMapCreateMap.putString("type", gVar.toString());
        writableMapCreateMap.putString("message", gVar.a());
        ((RCTEventEmitter) mkfVar.getJSModule(RCTEventEmitter.class)).receiveEvent(getId(), c.ERROR.toString(), writableMapCreateMap);
    }

    public final void o(String str, Object obj) {
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.a.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, obj);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        if (this.g0) {
            f13.c(this.k0, null);
            i iVar = this.j0;
            if (iVar != null) {
                iVar.dispose();
            }
            anc ancVar = this.b;
            if (ancVar != null) {
                yv8 lifecycleObserver = ancVar.getLifecycleObserver();
                lifecycleObserver.getClass();
                bnc bncVar = (bnc) lifecycleObserver;
                Iterator<T> it = bncVar.getDependencies().iterator();
                while (it.hasNext()) {
                    ((RefCount) it.next()).release();
                }
                bncVar.getDependencies().clear();
            }
            LinkedHashMap linkedHashMap = this.m0;
            Iterator it2 = linkedHashMap.values().iterator();
            while (it2.hasNext()) {
                ((h4c) it2.next()).d.h(null);
            }
            linkedHashMap.clear();
            anc ancVar2 = this.b;
            if (ancVar2 != null) {
                ancVar2.unregisterListener((RiveFileController.Listener) this.h0);
            }
            anc ancVar3 = this.b;
            if (ancVar3 != null) {
                ancVar3.removeEventListener(this.i0);
            }
            this.j0 = null;
            this.b = null;
            this.d0 = null;
        }
        super.onDetachedFromWindow();
    }

    public final void p(String str, boolean z) {
        ViewModelBooleanProperty booleanProperty;
        try {
            ViewModelInstance viewModelInstance = getViewModelInstance();
            if (viewModelInstance == null || (booleanProperty = viewModelInstance.getBooleanProperty(str)) == null) {
                return;
            }
            booleanProperty.setValue(Boolean.valueOf(z));
        } catch (RiveException e2) {
            f(e2);
        }
    }

    public final void q(String str, int i, int i2, int i3, int i4) {
        ViewModelColorProperty colorProperty;
        try {
            int iArgb = Color.argb(i4, i, i2, i3);
            ViewModelInstance viewModelInstance = getViewModelInstance();
            if (viewModelInstance == null || (colorProperty = viewModelInstance.getColorProperty(str)) == null) {
                return;
            }
            colorProperty.setValue(Integer.valueOf(iArgb));
        } catch (RiveException e2) {
            f(e2);
        }
    }

    public final void r(String str, String str2) {
        ViewModelEnumProperty enumProperty;
        try {
            ViewModelInstance viewModelInstance = getViewModelInstance();
            if (viewModelInstance == null || (enumProperty = viewModelInstance.getEnumProperty(str)) == null) {
                return;
            }
            enumProperty.setValue(str2);
        } catch (RiveException e2) {
            f(e2);
        }
    }

    public final void s(String str, float f) {
        ViewModelNumberProperty numberProperty;
        try {
            ViewModelInstance viewModelInstance = getViewModelInstance();
            if (viewModelInstance == null || (numberProperty = viewModelInstance.getNumberProperty(str)) == null) {
                return;
            }
            numberProperty.setValue(Float.valueOf(f));
        } catch (RiveException e2) {
            f(e2);
        }
    }

    public final void setAlignment(com.rivereactnative.b bVar) {
        Alignment alignment;
        bVar.getClass();
        com.rivereactnative.b.a.getClass();
        switch (bVar.ordinal()) {
            case 0:
                alignment = Alignment.TOP_LEFT;
                break;
            case 1:
                alignment = Alignment.TOP_CENTER;
                break;
            case 2:
                alignment = Alignment.TOP_RIGHT;
                break;
            case 3:
                alignment = Alignment.CENTER_LEFT;
                break;
            case 4:
                alignment = Alignment.CENTER;
                break;
            case 5:
                alignment = Alignment.CENTER_RIGHT;
                break;
            case 6:
                alignment = Alignment.BOTTOM_LEFT;
                break;
            case 7:
                alignment = Alignment.BOTTOM_CENTER;
                break;
            case 8:
                alignment = Alignment.BOTTOM_RIGHT;
                break;
            default:
                r6.g("Unsupported Alignment type");
                return;
        }
        this.b0 = alignment;
        anc ancVar = this.b;
        if (ancVar != null) {
            ancVar.setAlignment(alignment);
        }
    }

    public final void setAnimationName(String str) {
        str.getClass();
        if (wl7.b(this.f, str)) {
            return;
        }
        this.f = str;
        this.e0 = true;
    }

    public final void setArtboardName(String str) {
        str.getClass();
        try {
            this.W = str;
            anc ancVar = this.b;
            if (ancVar != null) {
                ancVar.setArtboardName(str);
            }
        } catch (RiveException e2) {
            f(e2);
        }
    }

    public final void setAutoplay(boolean z) {
        if (this.c0 == z) {
            return;
        }
        this.c0 = z;
        this.e0 = true;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void setDataBinding(ReadableMap readableMap) {
        String string;
        String strAsString;
        if (readableMap == null || (string = readableMap.getString("type")) == null) {
            return;
        }
        Dynamic dynamic = readableMap.getDynamic("value");
        com.rivereactnative.a dVar = null;
        switch (string.hashCode()) {
            case 3373707:
                if (string.equals("name") && dynamic.getType() == ReadableType.String && (strAsString = dynamic.asString()) != null) {
                    dVar = new a.d(strAsString);
                }
                break;
            case 96634189:
                if (string.equals("empty")) {
                    dVar = a.b.a;
                }
                break;
            case 100346066:
                if (string.equals("index") && dynamic.getType() == ReadableType.Number) {
                    dVar = new a.c(dynamic.asInt());
                }
                break;
            case 1439142508:
                if (string.equals("autobind") && dynamic.getType() == ReadableType.Boolean) {
                    dVar = new a.C0190a(dynamic.asBoolean());
                }
                break;
        }
        if (wl7.b(dVar, this.l0)) {
            return;
        }
        this.l0 = dVar;
        b();
    }

    public final void setFit(com.rivereactnative.d dVar) {
        Fit fit;
        dVar.getClass();
        com.rivereactnative.d.a.getClass();
        switch (dVar.ordinal()) {
            case 0:
                fit = Fit.COVER;
                break;
            case 1:
                fit = Fit.CONTAIN;
                break;
            case 2:
                fit = Fit.FILL;
                break;
            case 3:
                fit = Fit.FIT_WIDTH;
                break;
            case 4:
                fit = Fit.FIT_HEIGHT;
                break;
            case 5:
                fit = Fit.NONE;
                break;
            case 6:
                fit = Fit.SCALE_DOWN;
                break;
            case 7:
                fit = Fit.LAYOUT;
                break;
            default:
                l.g();
                return;
        }
        if (this.a0 == fit) {
            return;
        }
        this.a0 = fit;
        anc ancVar = this.b;
        if (ancVar != null) {
            ancVar.setFit(fit);
        }
    }

    public final void setIsUserHandlingErrors(boolean z) {
        this.f0 = z;
    }

    public final void setLayoutScaleFactor(Float f) {
        anc ancVar = this.b;
        if (ancVar != null) {
            ancVar.setLayoutScaleFactor(f);
        }
    }

    public final void setReferencedAssets(ReadableMap readableMap) throws Throwable {
        LinkedHashMap linkedHashMap;
        ReadableMap readableMap2 = this.d0;
        if (wl7.b(readableMap2 != null ? w(readableMap2) : null, readableMap != null ? w(readableMap) : null)) {
            return;
        }
        ReadableMap readableMap3 = this.d0;
        this.d0 = readableMap;
        if (readableMap3 == null || readableMap == null) {
            this.e0 = true;
            return;
        }
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = readableMap3.keySetIterator();
        ArrayList arrayList = new ArrayList();
        while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            arrayList.add(readableMapKeySetIteratorKeySetIterator.nextKey());
        }
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator2 = readableMap.keySetIterator();
        ArrayList<String> arrayList2 = new ArrayList();
        while (readableMapKeySetIteratorKeySetIterator2.hasNextKey()) {
            arrayList2.add(readableMapKeySetIteratorKeySetIterator2.nextKey());
        }
        if (!z92.E1(arrayList).equals(z92.E1(arrayList2))) {
            this.e0 = true;
            return;
        }
        for (String str : arrayList2) {
            ReadableMap map = readableMap3.getMap(str);
            ReadableMap map2 = readableMap.getMap(str);
            if (!wl7.b(map != null ? w(map) : null, map2 != null ? w(map2) : null)) {
                ReadableMap map3 = map2 != null ? map2.getMap("source") : null;
                i iVar = this.j0;
                FileAsset fileAsset = (iVar == null || (linkedHashMap = iVar.e) == null) ? null : (FileAsset) linkedHashMap.get(str);
                if (map3 != null && fileAsset != null) {
                    g(map3, fileAsset);
                }
            }
        }
    }

    public final void setResourceName(String str) {
        if (wl7.b(this.c, str)) {
            return;
        }
        this.c = str;
        if (str != null) {
            int identifier = getResources().getIdentifier(str, "raw", this.a.getPackageName());
            this.d = identifier;
            if (identifier == 0) {
                this.d = -1;
            }
        } else {
            this.d = -1;
        }
        this.e0 = true;
    }

    public final void setStateMachineName(String str) {
        str.getClass();
        if (wl7.b(this.V, str)) {
            return;
        }
        this.V = str;
        this.e0 = true;
    }

    public final void setUrl(String str) {
        if (wl7.b(this.e, str)) {
            return;
        }
        this.e = str;
        this.e0 = true;
    }

    public final void t(String str, String str2) {
        ViewModelStringProperty stringProperty;
        try {
            ViewModelInstance viewModelInstance = getViewModelInstance();
            if (viewModelInstance == null || (stringProperty = viewModelInstance.getStringProperty(str)) == null) {
                return;
            }
            stringProperty.setValue(str2);
        } catch (RiveException e2) {
            f(e2);
        }
    }

    public final void x() {
        anc ancVar;
        if (this.e0) {
            i iVar = this.j0;
            if (iVar != null) {
                iVar.dispose();
            }
            ReadableMap readableMap = this.d0;
            i iVar2 = readableMap != null ? new i(readableMap, new aed(2, this, j.class, "loadAsset", "loadAsset(Lcom/facebook/react/bridge/ReadableMap;Lapp/rive/runtime/kotlin/core/FileAsset;)V", 0)) : null;
            this.j0 = iVar2;
            if (iVar2 != null && (ancVar = this.b) != null) {
                ancVar.setAssetLoader(iVar2);
            }
            String str = this.e;
            int i = this.d;
            if (str != null) {
                if (i != -1) {
                    r6.g("You cannot pass both resourceName and url at the same time");
                    return;
                } else {
                    final boolean z = this.c0;
                    d(str, new l6d.b() { // from class: zdd
                        @Override // l6d.b
                        public final void e(Object obj) {
                            j.a(this.a, z, (byte[]) obj);
                        }
                    });
                }
            } else if (i != -1) {
                try {
                    anc ancVar2 = this.b;
                    if (ancVar2 != null) {
                        Fit fit = this.a0;
                        Alignment alignment = this.b0;
                        RiveAnimationView.setRiveResource$default(ancVar2, i, this.W, this.f, this.V, this.c0, getShouldAutoBind(), fit, alignment, null, IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER, null);
                    }
                    b();
                    o(getLoadedTag(), null);
                    this.e = null;
                } catch (RiveException e2) {
                    f(e2);
                }
            } else if (!this.f0) {
                r6.g("File resource not found. You must provide correct url or resourceName!");
                return;
            } else {
                g gVar = g.FileNotFound;
                gVar.c("File resource not found. You must provide correct url or resourceName!");
                n(gVar);
            }
            this.e0 = false;
        }
    }
}

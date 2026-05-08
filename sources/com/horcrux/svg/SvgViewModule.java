package com.horcrux.svg;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;
import defpackage.nmc;

/* JADX INFO: loaded from: classes2.dex */
@nmc(name = "RNSVGSvgViewModule")
class SvgViewModule extends NativeSvgViewModuleSpec {
    public static final String NAME = "RNSVGSvgViewModule";

    public class a implements Runnable {
        public final /* synthetic */ int a;
        public final /* synthetic */ ReadableMap b;
        public final /* synthetic */ Callback c;
        public final /* synthetic */ int d;

        /* JADX INFO: renamed from: com.horcrux.svg.SvgViewModule$a$a, reason: collision with other inner class name */
        public class RunnableC0159a implements Runnable {

            /* JADX INFO: renamed from: com.horcrux.svg.SvgViewModule$a$a$a, reason: collision with other inner class name */
            public class RunnableC0160a implements Runnable {
                public RunnableC0160a() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    a aVar = a.this;
                    SvgViewModule.toDataURL(aVar.a, aVar.b, aVar.c, aVar.d + 1);
                }
            }

            public RunnableC0159a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                SvgView svgViewByTag = SvgViewManager.getSvgViewByTag(a.this.a);
                if (svgViewByTag == null) {
                    return;
                }
                svgViewByTag.setToDataUrlTask(new RunnableC0160a());
            }
        }

        public class b implements Runnable {
            public b() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                a aVar = a.this;
                SvgViewModule.toDataURL(aVar.a, aVar.b, aVar.c, aVar.d + 1);
            }
        }

        public a(int i, ReadableMap readableMap, Callback callback, int i2) {
            this.a = i;
            this.b = readableMap;
            this.c = callback;
            this.d = i2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i = this.a;
            SvgView svgViewByTag = SvgViewManager.getSvgViewByTag(i);
            if (svgViewByTag == null) {
                SvgViewManager.runWhenViewIsAvailable(i, new RunnableC0159a());
                return;
            }
            if (svgViewByTag.notRendered()) {
                svgViewByTag.setToDataUrlTask(new b());
                return;
            }
            ReadableMap readableMap = this.b;
            Callback callback = this.c;
            if (readableMap != null) {
                callback.invoke(svgViewByTag.toDataURL(readableMap.getInt("width"), readableMap.getInt("height")));
            } else {
                callback.invoke(svgViewByTag.toDataURL());
            }
        }
    }

    public SvgViewModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void toDataURL(int i, ReadableMap readableMap, Callback callback, int i2) {
        UiThreadUtil.runOnUiThread(new a(i, readableMap, callback, i2));
    }

    @Override // com.horcrux.svg.NativeSvgViewModuleSpec, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNSVGSvgViewModule";
    }

    @Override // com.horcrux.svg.NativeSvgViewModuleSpec
    @ReactMethod
    public void toDataURL(Double d, ReadableMap readableMap, Callback callback) {
        toDataURL(d.intValue(), readableMap, callback, 0);
    }
}

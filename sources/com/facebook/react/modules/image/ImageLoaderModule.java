package com.facebook.react.modules.image;

import android.net.Uri;
import android.util.SparseArray;
import com.facebook.fbreact.specs.NativeImageLoaderAndroidSpec;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.facebook.imagepipeline.request.a;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapBuilder;
import com.facebook.react.bridge.WritableMap;
import defpackage.b91;
import defpackage.dnc;
import defpackage.j6g;
import defpackage.l82;
import defpackage.m27;
import defpackage.m5d;
import defpackage.n82;
import defpackage.nmc;
import defpackage.ojh;
import defpackage.q07;
import defpackage.q27;
import defpackage.rv1;
import defpackage.tf2;
import defpackage.tjc;
import defpackage.u1;
import defpackage.web;
import defpackage.ye3;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@nmc(name = "ImageLoader")
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\r\b\u0001\u0018\u0000 @2\u00020\u00012\u00020\u0002:\u0001AB\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0005\u0010\tB!\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0005\u0010\u000eJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u000f2\u000e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0017\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0018\u00010\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001d\u001a\u00020\u00142\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ+\u0010!\u001a\u00020\u00142\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u001c\u001a\u00020\u001bH\u0017¢\u0006\u0004\b!\u0010\"J)\u0010%\u001a\u00020\u00142\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010$\u001a\u00020#2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020#H\u0016¢\u0006\u0004\b'\u0010(J\u001f\u0010+\u001a\u00020\u00142\u0006\u0010*\u001a\u00020)2\u0006\u0010\u001c\u001a\u00020\u001bH\u0017¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0014H\u0016¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0014H\u0016¢\u0006\u0004\b/\u0010.J\u000f\u00100\u001a\u00020\u0014H\u0016¢\u0006\u0004\b0\u0010.R\u0018\u00101\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00103\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\"\u00106\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0011058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u00108R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078BX\u0082\u0004¢\u0006\f\n\u0004\b\b\u00104\u001a\u0004\b9\u0010:R$\u0010\u000b\u001a\u00020\n2\u0006\u0010;\u001a\u00020\n8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?¨\u0006B"}, d2 = {"Lcom/facebook/react/modules/image/ImageLoaderModule;", "Lcom/facebook/fbreact/specs/NativeImageLoaderAndroidSpec;", "Lcom/facebook/react/bridge/LifecycleEventListener;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "callerContext", "(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/lang/Object;)V", "Lm27;", "imagePipeline", "Ltjc;", "callerContextFactory", "(Lcom/facebook/react/bridge/ReactApplicationContext;Lm27;Ltjc;)V", "", "requestId", "Lye3;", "Ljava/lang/Void;", "request", "Lj6g;", "registerRequest", "(ILye3;)V", "removeRequest", "(I)Lye3;", "", "uriString", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "getSize", "(Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V", "Lcom/facebook/react/bridge/ReadableMap;", "headers", "getSizeWithHeaders", "(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V", "", "requestIdAsDouble", "prefetchImage", "(Ljava/lang/String;DLcom/facebook/react/bridge/Promise;)V", "abortRequest", "(D)V", "Lcom/facebook/react/bridge/ReadableArray;", "uris", "queryCache", "(Lcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/Promise;)V", "onHostResume", "()V", "onHostPause", "onHostDestroy", "_imagePipeline", "Lm27;", "enqueuedRequestMonitor", "Ljava/lang/Object;", "Landroid/util/SparseArray;", "enqueuedRequests", "Landroid/util/SparseArray;", "Ltjc;", "getCallerContext", "()Ljava/lang/Object;", "value", "getImagePipeline", "()Lm27;", "setImagePipeline", "(Lm27;)V", "Companion", "a", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ImageLoaderModule extends NativeImageLoaderAndroidSpec implements LifecycleEventListener {
    private static final String ERROR_GET_SIZE_FAILURE = "E_GET_SIZE_FAILURE";
    private static final String ERROR_INVALID_URI = "E_INVALID_URI";
    private static final String ERROR_PREFETCH_FAILURE = "E_PREFETCH_FAILURE";
    public static final String NAME = "ImageLoader";
    private m27 _imagePipeline;
    private final Object callerContext;
    private tjc callerContextFactory;
    private final Object enqueuedRequestMonitor;
    private final SparseArray<ye3<Void>> enqueuedRequests;

    public static final class b extends b91<n82<l82>> {
        public final /* synthetic */ Promise a;

        public b(Promise promise) {
            this.a = promise;
        }

        @Override // defpackage.b91
        public final void d(ye3<n82<l82>> ye3Var) {
            this.a.reject(ImageLoaderModule.ERROR_GET_SIZE_FAILURE, ye3Var.e());
        }

        @Override // defpackage.b91
        public final void e(ye3<n82<l82>> ye3Var) {
            if (ye3Var.d()) {
                n82<l82> result = ye3Var.getResult();
                Promise promise = this.a;
                if (result == null) {
                    promise.reject(ImageLoaderModule.ERROR_GET_SIZE_FAILURE, "Failed to get the size of the image");
                    return;
                }
                try {
                    l82 l82VarP = result.P();
                    WritableMap writableMapCreateMap = Arguments.createMap();
                    writableMapCreateMap.getClass();
                    ReadableMapBuilder readableMapBuilder = new ReadableMapBuilder(writableMapCreateMap);
                    readableMapBuilder.put("width", l82VarP.getWidth());
                    readableMapBuilder.put("height", l82VarP.getHeight());
                    promise.resolve(writableMapCreateMap);
                } catch (Exception e) {
                    promise.reject(ImageLoaderModule.ERROR_GET_SIZE_FAILURE, e);
                } finally {
                    result.close();
                }
            }
        }
    }

    public static final class c extends b91<n82<l82>> {
        public final /* synthetic */ Promise a;

        public c(Promise promise) {
            this.a = promise;
        }

        @Override // defpackage.b91
        public final void d(ye3<n82<l82>> ye3Var) {
            this.a.reject(ImageLoaderModule.ERROR_GET_SIZE_FAILURE, ye3Var.e());
        }

        @Override // defpackage.b91
        public final void e(ye3<n82<l82>> ye3Var) {
            if (ye3Var.d()) {
                n82<l82> result = ye3Var.getResult();
                Promise promise = this.a;
                if (result == null) {
                    promise.reject(ImageLoaderModule.ERROR_GET_SIZE_FAILURE, "Failed to get the size of the image");
                    return;
                }
                try {
                    l82 l82VarP = result.P();
                    WritableMap writableMapCreateMap = Arguments.createMap();
                    writableMapCreateMap.getClass();
                    ReadableMapBuilder readableMapBuilder = new ReadableMapBuilder(writableMapCreateMap);
                    readableMapBuilder.put("width", l82VarP.getWidth());
                    readableMapBuilder.put("height", l82VarP.getHeight());
                    promise.resolve(writableMapCreateMap);
                } catch (Exception e) {
                    promise.reject(ImageLoaderModule.ERROR_GET_SIZE_FAILURE, e);
                } finally {
                    result.close();
                }
            }
        }
    }

    public static final class d extends b91<Void> {
        public final /* synthetic */ int b;
        public final /* synthetic */ Promise c;

        public d(int i, Promise promise) {
            this.b = i;
            this.c = promise;
        }

        @Override // defpackage.b91
        public final void d(ye3<Void> ye3Var) {
            try {
                ImageLoaderModule.this.removeRequest(this.b);
                this.c.reject(ImageLoaderModule.ERROR_PREFETCH_FAILURE, ye3Var.e());
            } finally {
                ye3Var.close();
            }
        }

        @Override // defpackage.b91
        public final void e(ye3<Void> ye3Var) {
            Promise promise = this.c;
            if (ye3Var.d()) {
                try {
                    ImageLoaderModule.this.removeRequest(this.b);
                    promise.resolve(Boolean.TRUE);
                } catch (Exception e) {
                    promise.reject(ImageLoaderModule.ERROR_PREFETCH_FAILURE, e);
                } finally {
                    ye3Var.close();
                }
            }
        }
    }

    public static final class e extends GuardedAsyncTask<Void, Void> {
        public final /* synthetic */ Promise a;
        public final /* synthetic */ ImageLoaderModule b;
        public final /* synthetic */ ReadableArray c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Promise promise, ImageLoaderModule imageLoaderModule, ReadableArray readableArray, ReactApplicationContext reactApplicationContext) {
            super(reactApplicationContext);
            this.a = promise;
            this.b = imageLoaderModule;
            this.c = readableArray;
            reactApplicationContext.getClass();
        }

        @Override // com.facebook.react.bridge.GuardedAsyncTask
        public final void doInBackgroundGuarded(Void[] voidArr) {
            voidArr.getClass();
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.getClass();
            ReadableMapBuilder readableMapBuilder = new ReadableMapBuilder(writableMapCreateMap);
            m27 imagePipeline = this.b.getImagePipeline();
            ReadableArray readableArray = this.c;
            int size = readableArray.size();
            for (int i = 0; i < size; i++) {
                String string = readableArray.getString(i);
                if (string != null && string.length() != 0) {
                    Uri uri = Uri.parse(string);
                    imagePipeline.getClass();
                    if (uri == null ? false : imagePipeline.f.b(new tf2(uri, 3))) {
                        readableMapBuilder.put(string, "memory");
                    } else if (imagePipeline.b(uri, a.b.a) || imagePipeline.b(uri, a.b.b) || imagePipeline.b(uri, a.b.c)) {
                        readableMapBuilder.put(string, "disk");
                    }
                }
            }
            this.a.resolve(writableMapCreateMap);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageLoaderModule(ReactApplicationContext reactApplicationContext, m27 m27Var, tjc tjcVar) {
        super(reactApplicationContext);
        reactApplicationContext.getClass();
        m27Var.getClass();
        tjcVar.getClass();
        this.enqueuedRequestMonitor = new Object();
        this.enqueuedRequests = new SparseArray<>();
        setImagePipeline(m27Var);
        this.callerContext = null;
    }

    private final Object getCallerContext() {
        return this.callerContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final m27 getImagePipeline() {
        m27 m27Var = this._imagePipeline;
        if (m27Var != null) {
            return m27Var;
        }
        q27 q27Var = q27.p;
        web.h(q27Var, "ImagePipelineFactory was not initialized!");
        m27 m27VarE = q27Var.e();
        m27VarE.getClass();
        return m27VarE;
    }

    private final void registerRequest(int requestId, ye3<Void> request) {
        synchronized (this.enqueuedRequestMonitor) {
            this.enqueuedRequests.put(requestId, request);
            j6g j6gVar = j6g.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ye3<Void> removeRequest(int requestId) {
        ye3<Void> ye3Var;
        synchronized (this.enqueuedRequestMonitor) {
            ye3Var = this.enqueuedRequests.get(requestId);
            this.enqueuedRequests.remove(requestId);
        }
        return ye3Var;
    }

    private final void setImagePipeline(m27 m27Var) {
        this._imagePipeline = m27Var;
    }

    @Override // com.facebook.fbreact.specs.NativeImageLoaderAndroidSpec
    public void abortRequest(double requestId) {
        ye3<Void> ye3VarRemoveRequest = removeRequest((int) requestId);
        if (ye3VarRemoveRequest != null) {
            ye3VarRemoveRequest.close();
        }
    }

    @Override // com.facebook.fbreact.specs.NativeImageLoaderAndroidSpec
    @ReactMethod
    public void getSize(String uriString, Promise promise) {
        Uri uriB;
        promise.getClass();
        if (uriString == null || uriString.length() == 0) {
            promise.reject(ERROR_INVALID_URI, "Cannot get the size of an image for an empty URI");
            return;
        }
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        reactApplicationContext.getClass();
        ((28 & 16) != 0 ? q07.a : null).getClass();
        try {
            uriB = Uri.parse(uriString);
            if (uriB.getScheme() == null) {
                uriB = m5d.b(reactApplicationContext, uriString);
            }
        } catch (NullPointerException unused) {
            uriB = m5d.b(reactApplicationContext, uriString);
        }
        getImagePipeline().a(ImageRequestBuilder.d(uriB).a(), getCallerContext(), null, null, null).f(new b(promise), rv1.a);
    }

    @Override // com.facebook.fbreact.specs.NativeImageLoaderAndroidSpec
    @ReactMethod
    public void getSizeWithHeaders(String uriString, ReadableMap headers, Promise promise) {
        Uri uriB;
        promise.getClass();
        if (uriString == null || uriString.length() == 0) {
            promise.reject(ERROR_INVALID_URI, "Cannot get the size of an image for an empty URI");
            return;
        }
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        reactApplicationContext.getClass();
        int i = 28 & 16;
        q07 q07Var = q07.a;
        (i != 0 ? q07Var : null).getClass();
        try {
            uriB = Uri.parse(uriString);
            if (uriB.getScheme() == null) {
                uriB = m5d.b(reactApplicationContext, uriString);
            }
        } catch (NullPointerException unused) {
            uriB = m5d.b(reactApplicationContext, uriString);
        }
        getImagePipeline().a(new dnc(ImageRequestBuilder.d(uriB), headers, q07Var), getCallerContext(), null, null, null).f(new c(promise), rv1.a);
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        synchronized (this.enqueuedRequestMonitor) {
            try {
                int size = this.enqueuedRequests.size();
                int i = 0;
                while (true) {
                    SparseArray<ye3<Void>> sparseArray = this.enqueuedRequests;
                    if (i < size) {
                        ye3<Void> ye3VarValueAt = sparseArray.valueAt(i);
                        ye3VarValueAt.getClass();
                        ye3VarValueAt.close();
                        i++;
                    } else {
                        sparseArray.clear();
                        j6g j6gVar = j6g.a;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
    }

    @Override // com.facebook.fbreact.specs.NativeImageLoaderAndroidSpec
    public void prefetchImage(String uriString, double requestIdAsDouble, Promise promise) {
        u1 u1VarQ;
        promise.getClass();
        int i = (int) requestIdAsDouble;
        if (uriString == null || uriString.length() == 0) {
            promise.reject(ERROR_INVALID_URI, "Cannot prefetch an image for an empty URI");
            return;
        }
        a aVarA = ImageRequestBuilder.d(Uri.parse(uriString)).a();
        m27 imagePipeline = getImagePipeline();
        Object callerContext = getCallerContext();
        imagePipeline.getClass();
        if (imagePipeline.b.get().booleanValue()) {
            try {
                u1VarQ = imagePipeline.e(imagePipeline.a.d(aVarA), aVarA, callerContext);
            } catch (Exception e2) {
                u1VarQ = ojh.q(e2);
            }
        } else {
            u1VarQ = ojh.q(m27.l);
        }
        d dVar = new d(i, promise);
        registerRequest(i, u1VarQ);
        u1VarQ.f(dVar, rv1.a);
    }

    @Override // com.facebook.fbreact.specs.NativeImageLoaderAndroidSpec
    @ReactMethod
    public void queryCache(ReadableArray uris, Promise promise) {
        uris.getClass();
        promise.getClass();
        new e(promise, this, uris, getReactApplicationContext()).executeOnExecutor(GuardedAsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageLoaderModule(ReactApplicationContext reactApplicationContext, Object obj) {
        super(reactApplicationContext);
        reactApplicationContext.getClass();
        this.enqueuedRequestMonitor = new Object();
        this.enqueuedRequests = new SparseArray<>();
        this.callerContext = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageLoaderModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        reactApplicationContext.getClass();
        this.enqueuedRequestMonitor = new Object();
        this.enqueuedRequests = new SparseArray<>();
        this.callerContext = this;
    }
}

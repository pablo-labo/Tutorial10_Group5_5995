package com.facebook.react.modules.blob;

import android.util.Base64;
import com.facebook.fbreact.specs.NativeFileReaderModuleSpec;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import defpackage.nmc;
import java.nio.charset.Charset;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@nmc(name = NativeFileReaderModuleSpec.NAME)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0016B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/facebook/react/modules/blob/FileReaderModule;", "Lcom/facebook/fbreact/specs/NativeFileReaderModuleSpec;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "reason", "Lcom/facebook/react/modules/blob/BlobModule;", "getBlobModule", "(Ljava/lang/String;)Lcom/facebook/react/modules/blob/BlobModule;", "Lcom/facebook/react/bridge/ReadableMap;", "blob", "encoding", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "Lj6g;", "readAsText", "(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V", "readAsDataURL", "(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V", "Companion", "a", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FileReaderModule extends NativeFileReaderModuleSpec {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private static final String ERROR_INVALID_BLOB = "ERROR_INVALID_BLOB";
    private static final String NAME = "FileReaderModule";

    /* JADX INFO: renamed from: com.facebook.react.modules.blob.FileReaderModule$a, reason: from kotlin metadata */
    public static final class Companion {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileReaderModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        reactApplicationContext.getClass();
    }

    private final BlobModule getBlobModule(String reason) {
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            return (BlobModule) reactApplicationContextIfActiveOrWarn.getNativeModule(BlobModule.class);
        }
        return null;
    }

    @Override // com.facebook.fbreact.specs.NativeFileReaderModuleSpec
    public void readAsDataURL(ReadableMap blob, Promise promise) {
        String string;
        blob.getClass();
        promise.getClass();
        BlobModule blobModule = getBlobModule("readAsDataURL");
        if (blobModule == null) {
            promise.reject(new IllegalStateException("Could not get BlobModule from ReactApplicationContext"));
            return;
        }
        String string2 = blob.getString("blobId");
        if (string2 == null) {
            promise.reject(ERROR_INVALID_BLOB, "The specified blob does not contain a blobId");
            return;
        }
        byte[] bArrResolve = blobModule.resolve(string2, blob.getInt("offset"), blob.getInt("size"));
        if (bArrResolve == null) {
            promise.reject(ERROR_INVALID_BLOB, "The specified blob is invalid");
            return;
        }
        try {
            StringBuilder sb = new StringBuilder("data:");
            if (!blob.hasKey("type") || (string = blob.getString("type")) == null || string.length() == 0) {
                sb.append("application/octet-stream");
            } else {
                sb.append(blob.getString("type"));
            }
            sb.append(";base64,");
            sb.append(Base64.encodeToString(bArrResolve, 2));
            promise.resolve(sb.toString());
        } catch (Exception e) {
            promise.reject(e);
        }
    }

    @Override // com.facebook.fbreact.specs.NativeFileReaderModuleSpec
    public void readAsText(ReadableMap blob, String encoding, Promise promise) {
        blob.getClass();
        encoding.getClass();
        promise.getClass();
        BlobModule blobModule = getBlobModule("readAsText");
        if (blobModule == null) {
            promise.reject(new IllegalStateException("Could not get BlobModule from ReactApplicationContext"));
            return;
        }
        String string = blob.getString("blobId");
        if (string == null) {
            promise.reject(ERROR_INVALID_BLOB, "The specified blob does not contain a blobId");
            return;
        }
        byte[] bArrResolve = blobModule.resolve(string, blob.getInt("offset"), blob.getInt("size"));
        if (bArrResolve == null) {
            promise.reject(ERROR_INVALID_BLOB, "The specified blob is invalid");
            return;
        }
        try {
            Charset charsetForName = Charset.forName(encoding);
            charsetForName.getClass();
            promise.resolve(new String(bArrResolve, charsetForName));
        } catch (Exception e) {
            promise.reject(e);
        }
    }
}

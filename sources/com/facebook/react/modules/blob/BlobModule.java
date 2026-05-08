package com.facebook.react.modules.blob;

import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import com.facebook.fbreact.specs.NativeBlobModuleSpec;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapBuilder;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.modules.network.NetworkingModule;
import com.facebook.react.modules.websocket.WebSocketModule;
import defpackage.bs4;
import defpackage.f84;
import defpackage.j6g;
import defpackage.juc;
import defpackage.l5;
import defpackage.lc9;
import defpackage.nmc;
import defpackage.p6;
import defpackage.ph1;
import defpackage.r6;
import defpackage.vr1;
import defpackage.wl7;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Pair;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.RequestBody$Companion$toRequestBody$2;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes2.dex */
@nmc(name = "BlobModule")
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0004;>AD\b\u0007\u0018\u0000 K2\u00020\u0001:\u0001LB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\rJ\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00160\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\b¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u000b¢\u0006\u0004\b\u001a\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u000bH\u0007¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u0004\u0018\u00010\b2\u0006\u0010#\u001a\u00020\u0006¢\u0006\u0004\b$\u0010\nJ)\u0010$\u001a\u0004\u0018\u00010\b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u000b2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020%¢\u0006\u0004\b$\u0010(J\u0017\u0010$\u001a\u0004\u0018\u00010\b2\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b$\u0010+J\u000f\u0010,\u001a\u00020\u0012H\u0016¢\u0006\u0004\b,\u0010\u0014J\u0017\u0010.\u001a\u00020\u00122\u0006\u0010-\u001a\u00020\u000eH\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020\u00122\u0006\u0010-\u001a\u00020\u000eH\u0016¢\u0006\u0004\b0\u0010/J\u001f\u00101\u001a\u00020\u00122\u0006\u0010*\u001a\u00020)2\u0006\u0010-\u001a\u00020\u000eH\u0016¢\u0006\u0004\b1\u00102J\u001f\u00105\u001a\u00020\u00122\u0006\u00104\u001a\u0002032\u0006\u0010\u001c\u001a\u00020\u000bH\u0016¢\u0006\u0004\b5\u00106J\u0017\u00107\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u000bH\u0016¢\u0006\u0004\b7\u0010\"R \u00109\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010<\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010?\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010B\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010E\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010J\u001a\u0004\u0018\u00010G8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bH\u0010I¨\u0006M"}, d2 = {"Lcom/facebook/react/modules/blob/BlobModule;", "Lcom/facebook/fbreact/specs/NativeBlobModuleSpec;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "Landroid/net/Uri;", "contentUri", "", "getBytesFromUri", "(Landroid/net/Uri;)[B", "", "getNameFromUri", "(Landroid/net/Uri;)Ljava/lang/String;", "", "getLastModifiedFromUri", "(Landroid/net/Uri;)D", "getMimeTypeFromUri", "Lj6g;", "initialize", "()V", "", "", "getTypedExportedConstants", "()Ljava/util/Map;", "data", "store", "([B)Ljava/lang/String;", "blobId", "([BLjava/lang/String;)V", "", "getLengthOfBlob", "(Ljava/lang/String;)J", "remove", "(Ljava/lang/String;)V", "uri", "resolve", "", "offset", "size", "(Ljava/lang/String;II)[B", "Lcom/facebook/react/bridge/ReadableMap;", "blob", "(Lcom/facebook/react/bridge/ReadableMap;)[B", "addNetworkingHandler", "idDouble", "addWebSocketHandler", "(D)V", "removeWebSocketHandler", "sendOverSocket", "(Lcom/facebook/react/bridge/ReadableMap;D)V", "Lcom/facebook/react/bridge/ReadableArray;", "parts", "createFromParts", "(Lcom/facebook/react/bridge/ReadableArray;Ljava/lang/String;)V", "release", "Ljava/util/HashMap;", "blobs", "Ljava/util/HashMap;", "com/facebook/react/modules/blob/BlobModule$e", "webSocketContentHandler", "Lcom/facebook/react/modules/blob/BlobModule$e;", "com/facebook/react/modules/blob/BlobModule$d", "networkingUriHandler", "Lcom/facebook/react/modules/blob/BlobModule$d;", "com/facebook/react/modules/blob/BlobModule$b", "networkingRequestBodyHandler", "Lcom/facebook/react/modules/blob/BlobModule$b;", "com/facebook/react/modules/blob/BlobModule$c", "networkingResponseHandler", "Lcom/facebook/react/modules/blob/BlobModule$c;", "Lcom/facebook/react/modules/websocket/WebSocketModule;", "getWebSocketModule", "()Lcom/facebook/react/modules/websocket/WebSocketModule;", "webSocketModule", "Companion", "a", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BlobModule extends NativeBlobModuleSpec {
    public static final String NAME = "BlobModule";
    private final HashMap<String, byte[]> blobs;
    private final b networkingRequestBodyHandler;
    private final c networkingResponseHandler;
    private final d networkingUriHandler;
    private final e webSocketContentHandler;

    public static final class b implements NetworkingModule.b {
        public b() {
        }

        @Override // com.facebook.react.modules.network.NetworkingModule.b
        public final boolean a(ReadableMap readableMap) {
            return readableMap.hasKey("blob");
        }

        @Override // com.facebook.react.modules.network.NetworkingModule.b
        public final RequestBody$Companion$toRequestBody$2 b(ReadableMap readableMap, String str) {
            String string;
            if (readableMap.hasKey("type") && (string = readableMap.getString("type")) != null && string.length() != 0) {
                str = readableMap.getString("type");
            }
            if (str == null) {
                str = "application/octet-stream";
            }
            ReadableMap map = readableMap.getMap("blob");
            MediaType mediaTypeA = null;
            if (map == null) {
                r6.g("Required value was null.");
                return null;
            }
            byte[] bArrResolve = BlobModule.this.resolve(map.getString("blobId"), map.getInt("offset"), map.getInt("size"));
            if (bArrResolve == null) {
                r6.g("Required value was null.");
                return null;
            }
            RequestBody.Companion companion = RequestBody.INSTANCE;
            MediaType.e.getClass();
            try {
                mediaTypeA = MediaType.Companion.a(str);
            } catch (IllegalArgumentException unused) {
            }
            return RequestBody.Companion.c(companion, mediaTypeA, bArrResolve, 0, 12);
        }
    }

    public static final class c implements NetworkingModule.c {
        public c() {
        }

        @Override // com.facebook.react.modules.network.NetworkingModule.c
        public final boolean a(String str) {
            return str.equals("blob");
        }

        @Override // com.facebook.react.modules.network.NetworkingModule.c
        public final WritableMap b(ResponseBody responseBody) throws IOException {
            byte[] bArrH = responseBody.h();
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.getClass();
            writableMapCreateMap.putString("blobId", BlobModule.this.store(bArrH));
            writableMapCreateMap.putInt("offset", 0);
            writableMapCreateMap.putInt("size", bArrH.length);
            return writableMapCreateMap;
        }
    }

    public static final class d implements NetworkingModule.d {
        public d() {
        }

        @Override // com.facebook.react.modules.network.NetworkingModule.d
        public final WritableMap a(Uri uri) throws IOException {
            BlobModule blobModule = BlobModule.this;
            byte[] bytesFromUri = blobModule.getBytesFromUri(uri);
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.getClass();
            writableMapCreateMap.putString("blobId", blobModule.store(bytesFromUri));
            writableMapCreateMap.putInt("offset", 0);
            writableMapCreateMap.putInt("size", bytesFromUri.length);
            writableMapCreateMap.putString("type", blobModule.getMimeTypeFromUri(uri));
            writableMapCreateMap.putString("name", blobModule.getNameFromUri(uri));
            writableMapCreateMap.putDouble("lastModified", blobModule.getLastModifiedFromUri(uri));
            return writableMapCreateMap;
        }

        @Override // com.facebook.react.modules.network.NetworkingModule.d
        public final boolean b(Uri uri, String str) {
            String scheme = uri.getScheme();
            return (wl7.b(scheme, "http") || wl7.b(scheme, "https") || !str.equals("blob")) ? false : true;
        }
    }

    public static final class e implements WebSocketModule.b {
        public e() {
        }

        @Override // com.facebook.react.modules.websocket.WebSocketModule.b
        public final void a(String str, WritableMap writableMap) {
            writableMap.putString("data", str);
        }

        @Override // com.facebook.react.modules.websocket.WebSocketModule.b
        public final void b(vr1 vr1Var, WritableMap writableMap) {
            vr1Var.getClass();
            byte[] bArrZ = vr1Var.z();
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.getClass();
            ReadableMapBuilder readableMapBuilder = new ReadableMapBuilder(writableMapCreateMap);
            readableMapBuilder.put("blobId", BlobModule.this.store(bArrZ));
            readableMapBuilder.put("offset", 0);
            readableMapBuilder.put("size", bArrZ.length);
            writableMap.putMap("data", writableMapCreateMap);
            writableMap.putString("type", "blob");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlobModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        reactApplicationContext.getClass();
        this.blobs = new HashMap<>();
        this.webSocketContentHandler = new e();
        this.networkingUriHandler = new d();
        this.networkingRequestBodyHandler = new b();
        this.networkingResponseHandler = new c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final byte[] getBytesFromUri(Uri contentUri) throws IOException {
        InputStream inputStreamOpenInputStream = getReactApplicationContext().getContentResolver().openInputStream(contentUri);
        if (inputStreamOpenInputStream == null) {
            throw new FileNotFoundException(p6.d(contentUri, "File not found for "));
        }
        try {
            byte[] bArr = new byte[Math.max(IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET, inputStreamOpenInputStream.available())];
            juc jucVar = new juc();
            byte[] bArr2 = new byte[IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET];
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            int i = 0;
            while (true) {
                int i2 = inputStreamOpenInputStream.read(bArr);
                jucVar.element = i2;
                if (i2 == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr2, 0, i);
                i = jucVar.element;
                byte[] bArr3 = bArr2;
                bArr2 = bArr;
                bArr = bArr3;
            }
            if (byteArrayOutputStream.size() == 0 && bArr2.length == i) {
                inputStreamOpenInputStream.close();
                return bArr2;
            }
            byteArrayOutputStream.write(bArr2, 0, i);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArray.getClass();
            inputStreamOpenInputStream.close();
            return byteArray;
        } catch (Throwable th) {
            inputStreamOpenInputStream.close();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final double getLastModifiedFromUri(Uri contentUri) {
        if (wl7.b(contentUri.getScheme(), "file")) {
            return new File(contentUri.toString()).lastModified();
        }
        return 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getMimeTypeFromUri(Uri contentUri) {
        String fileExtensionFromUrl;
        String type = getReactApplicationContext().getContentResolver().getType(contentUri);
        if (type == null && (fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(contentUri.getPath())) != null) {
            type = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
        }
        return type == null ? "" : type;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getNameFromUri(Uri contentUri) throws IOException {
        if (wl7.b(contentUri.getScheme(), "file")) {
            return contentUri.getLastPathSegment();
        }
        Cursor cursorQuery = getReactApplicationContext().getContentResolver().query(contentUri, new String[]{"_display_name"}, null, null, null);
        if (cursorQuery != null) {
            try {
                if (cursorQuery.moveToFirst()) {
                    String string = cursorQuery.getString(0);
                    cursorQuery.close();
                    return string;
                }
                j6g j6gVar = j6g.a;
                cursorQuery.close();
            } finally {
            }
        }
        return contentUri.getLastPathSegment();
    }

    private final WebSocketModule getWebSocketModule() {
        return (WebSocketModule) getReactApplicationContext().getNativeModule(WebSocketModule.class);
    }

    @Override // com.facebook.fbreact.specs.NativeBlobModuleSpec
    public void addNetworkingHandler() {
        NativeModule nativeModule = getReactApplicationContext().getNativeModule((Class<NativeModule>) NetworkingModule.class);
        if (nativeModule == null) {
            r6.g("Required value was null.");
            return;
        }
        NetworkingModule networkingModule = (NetworkingModule) nativeModule;
        networkingModule.addUriHandler$ReactAndroid_release(this.networkingUriHandler);
        networkingModule.addRequestBodyHandler$ReactAndroid_release(this.networkingRequestBodyHandler);
        networkingModule.addResponseHandler$ReactAndroid_release(this.networkingResponseHandler);
    }

    @Override // com.facebook.fbreact.specs.NativeBlobModuleSpec
    public void addWebSocketHandler(double idDouble) {
        int i = (int) idDouble;
        WebSocketModule webSocketModule = getWebSocketModule();
        if (webSocketModule != null) {
            webSocketModule.setContentHandler(i, this.webSocketContentHandler);
        }
    }

    @Override // com.facebook.fbreact.specs.NativeBlobModuleSpec
    public void createFromParts(ReadableArray parts, String blobId) {
        parts.getClass();
        blobId.getClass();
        ArrayList arrayList = new ArrayList(parts.size());
        int size = parts.size();
        int length = 0;
        for (int i = 0; i < size; i++) {
            ReadableMap map = parts.getMap(i);
            if (map == null) {
                r6.g("Required value was null.");
                return;
            }
            String string = map.getString("type");
            if (string == null) {
                r6.g("Required value was null.");
                return;
            }
            if (string.equals("blob")) {
                ReadableMap map2 = map.getMap("data");
                if (map2 == null) {
                    r6.g("Required value was null.");
                    return;
                }
                int i2 = map2.getInt("size") + length;
                byte[] bArrResolve = resolve(map2);
                if (bArrResolve == null) {
                    r6.g("Required value was null.");
                    return;
                } else {
                    arrayList.add(i, bArrResolve);
                    length = i2;
                }
            } else {
                if (!string.equals("string")) {
                    l5.q(l5.l("Invalid type for blob: ", map.getString("type")));
                    return;
                }
                String string2 = map.getString("data");
                if (string2 == null) {
                    r6.g("Required value was null.");
                    return;
                }
                Charset charsetForName = Charset.forName("UTF-8");
                charsetForName.getClass();
                byte[] bytes = string2.getBytes(charsetForName);
                bytes.getClass();
                length += bytes.length;
                arrayList.add(i, bytes);
            }
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
        Iterator it = arrayList.iterator();
        it.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            next.getClass();
            byteBufferAllocate.put((byte[]) next);
        }
        byte[] bArrArray = byteBufferAllocate.array();
        bArrArray.getClass();
        store(bArrArray, blobId);
    }

    @f84
    public final long getLengthOfBlob(String blobId) {
        long length;
        blobId.getClass();
        synchronized (this.blobs) {
            length = this.blobs.get(blobId) != null ? r1.length : 0L;
        }
        return length;
    }

    @Override // com.facebook.fbreact.specs.NativeBlobModuleSpec
    public Map<String, Object> getTypedExportedConstants() {
        Resources resources = getReactApplicationContext().getResources();
        int identifier = resources.getIdentifier("blob_provider_authority", "string", getReactApplicationContext().getPackageName());
        return identifier == 0 ? bs4.a : lc9.a0(new Pair("BLOB_URI_SCHEME", "content"), new Pair("BLOB_URI_HOST", resources.getString(identifier)));
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void initialize() {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        reactApplicationContext.getClass();
        BlobCollector blobCollector = BlobCollector.a;
        reactApplicationContext.runOnJSQueueThread(new ph1(0, reactApplicationContext, this));
    }

    @Override // com.facebook.fbreact.specs.NativeBlobModuleSpec
    public void release(String blobId) {
        blobId.getClass();
        remove(blobId);
    }

    @f84
    public final void remove(String blobId) {
        blobId.getClass();
        synchronized (this.blobs) {
            this.blobs.remove(blobId);
        }
    }

    @Override // com.facebook.fbreact.specs.NativeBlobModuleSpec
    public void removeWebSocketHandler(double idDouble) {
        int i = (int) idDouble;
        WebSocketModule webSocketModule = getWebSocketModule();
        if (webSocketModule != null) {
            webSocketModule.setContentHandler(i, null);
        }
    }

    public final byte[] resolve(String blobId, int offset, int size) {
        synchronized (this.blobs) {
            try {
                byte[] bArr = this.blobs.get(blobId);
                if (bArr == null) {
                    return null;
                }
                if (size == -1) {
                    size = bArr.length - offset;
                }
                if (offset <= 0 && size == bArr.length) {
                    return bArr;
                }
                return Arrays.copyOfRange(bArr, offset, size + offset);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.facebook.fbreact.specs.NativeBlobModuleSpec
    public void sendOverSocket(ReadableMap blob, double idDouble) {
        byte[] bArrResolve;
        blob.getClass();
        int i = (int) idDouble;
        WebSocketModule webSocketModule = getWebSocketModule();
        if (webSocketModule == null || (bArrResolve = resolve(blob.getString("blobId"), blob.getInt("offset"), blob.getInt("size"))) == null) {
            return;
        }
        vr1 vr1Var = vr1.c;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArrResolve);
        byteBufferWrap.getClass();
        byte[] bArr = new byte[byteBufferWrap.remaining()];
        byteBufferWrap.get(bArr);
        webSocketModule.sendBinary(new vr1(bArr), i);
    }

    public final void store(byte[] data, String blobId) {
        data.getClass();
        blobId.getClass();
        synchronized (this.blobs) {
            this.blobs.put(blobId, data);
            j6g j6gVar = j6g.a;
        }
    }

    public final String store(byte[] data) {
        data.getClass();
        String string = UUID.randomUUID().toString();
        string.getClass();
        store(data, string);
        return string;
    }

    public final byte[] resolve(Uri uri) {
        uri.getClass();
        String lastPathSegment = uri.getLastPathSegment();
        String queryParameter = uri.getQueryParameter("offset");
        int i = queryParameter != null ? Integer.parseInt(queryParameter) : 0;
        String queryParameter2 = uri.getQueryParameter("size");
        return resolve(lastPathSegment, i, queryParameter2 != null ? Integer.parseInt(queryParameter2) : -1);
    }

    public final byte[] resolve(ReadableMap blob) {
        blob.getClass();
        return resolve(blob.getString("blobId"), blob.getInt("offset"), blob.getInt("size"));
    }
}

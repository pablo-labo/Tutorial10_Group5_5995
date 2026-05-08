package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.android.volley.VolleyError;
import defpackage.jtg;
import defpackage.l6d;
import defpackage.o4d;
import defpackage.ts1;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class m3d<T> implements Comparable<m3d<T>> {
    private static final String DEFAULT_PARAMS_ENCODING = "UTF-8";
    private ts1.a mCacheEntry;
    private boolean mCanceled;
    private final int mDefaultTrafficStatsTag;
    private l6d.a mErrorListener;
    private final jtg.a mEventLog;
    private final Object mLock;
    private final int mMethod;
    private b mRequestCompleteListener;
    private o4d mRequestQueue;
    private boolean mResponseDelivered;
    private fad mRetryPolicy;
    private Integer mSequence;
    private boolean mShouldCache;
    private boolean mShouldRetryConnectionErrors;
    private boolean mShouldRetryServerErrors;
    private Object mTag;
    private final String mUrl;

    public class a implements Runnable {
        public final /* synthetic */ String a;
        public final /* synthetic */ long b;

        public a(String str, long j) {
            this.a = str;
            this.b = j;
        }

        @Override // java.lang.Runnable
        public final void run() {
            m3d m3dVar = m3d.this;
            m3dVar.mEventLog.a(this.b, this.a);
            m3dVar.mEventLog.b(m3dVar.toString());
        }
    }

    public interface b {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class c {
        public static final c a;
        public static final /* synthetic */ c[] b;

        /* JADX INFO: Fake field, exist only in values array */
        c EF0;

        static {
            c cVar = new c("LOW", 0);
            c cVar2 = new c("NORMAL", 1);
            a = cVar2;
            b = new c[]{cVar, cVar2, new c("HIGH", 2), new c("IMMEDIATE", 3)};
        }

        public c() {
            throw null;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) b.clone();
        }
    }

    public m3d(int i, String str, l6d.a aVar) {
        this.mEventLog = jtg.a.c ? new jtg.a() : null;
        this.mLock = new Object();
        this.mShouldCache = true;
        this.mCanceled = false;
        this.mResponseDelivered = false;
        this.mShouldRetryServerErrors = false;
        this.mShouldRetryConnectionErrors = false;
        this.mCacheEntry = null;
        this.mMethod = i;
        this.mUrl = str;
        this.mErrorListener = aVar;
        bu0 bu0Var = new bu0();
        bu0Var.a = 2500;
        setRetryPolicy(bu0Var);
        this.mDefaultTrafficStatsTag = findDefaultTrafficStatsTag(str);
    }

    private byte[] encodeParameters(Map<String, String> map, String str) {
        StringBuilder sb = new StringBuilder();
        try {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (entry.getKey() == null || entry.getValue() == null) {
                    throw new IllegalArgumentException(String.format("Request#getParams() or Request#getPostParams() returned a map containing a null key or value: (%s, %s). All keys and values must be non-null.", entry.getKey(), entry.getValue()));
                }
                sb.append(URLEncoder.encode(entry.getKey(), str));
                sb.append('=');
                sb.append(URLEncoder.encode(entry.getValue(), str));
                sb.append('&');
            }
            return sb.toString().getBytes(str);
        } catch (UnsupportedEncodingException e) {
            l6.p(l5.l("Encoding not supported: ", str), e);
            return null;
        }
    }

    private static int findDefaultTrafficStatsTag(String str) {
        Uri uri;
        String host;
        if (TextUtils.isEmpty(str) || (uri = Uri.parse(str)) == null || (host = uri.getHost()) == null) {
            return 0;
        }
        return host.hashCode();
    }

    public void addMarker(String str) {
        if (jtg.a.c) {
            this.mEventLog.a(Thread.currentThread().getId(), str);
        }
    }

    public void cancel() {
        synchronized (this.mLock) {
            this.mCanceled = true;
            this.mErrorListener = null;
        }
    }

    @Override // java.lang.Comparable
    public int compareTo(m3d<T> m3dVar) {
        int iOrdinal;
        int iOrdinal2;
        c priority = getPriority();
        c priority2 = m3dVar.getPriority();
        if (priority == priority2) {
            iOrdinal = this.mSequence.intValue();
            iOrdinal2 = m3dVar.mSequence.intValue();
        } else {
            iOrdinal = priority2.ordinal();
            iOrdinal2 = priority.ordinal();
        }
        return iOrdinal - iOrdinal2;
    }

    public void deliverError(VolleyError volleyError) {
        l6d.a aVar;
        synchronized (this.mLock) {
            aVar = this.mErrorListener;
        }
        if (aVar != null) {
            aVar.e(volleyError);
        }
    }

    public abstract void deliverResponse(T t);

    public void finish(String str) {
        o4d o4dVar = this.mRequestQueue;
        if (o4dVar != null) {
            synchronized (o4dVar.b) {
                o4dVar.b.remove(this);
            }
            synchronized (o4dVar.j) {
                try {
                    Iterator it = o4dVar.j.iterator();
                    while (it.hasNext()) {
                        ((o4d.b) it.next()).a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            o4dVar.b(this, 5);
        }
        if (jtg.a.c) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new a(str, id));
            } else {
                this.mEventLog.a(id, str);
                this.mEventLog.b(toString());
            }
        }
    }

    public byte[] getBody() {
        Map<String, String> params = getParams();
        if (params == null || params.size() <= 0) {
            return null;
        }
        return encodeParameters(params, getParamsEncoding());
    }

    public String getBodyContentType() {
        return "application/x-www-form-urlencoded; charset=" + getParamsEncoding();
    }

    public ts1.a getCacheEntry() {
        return this.mCacheEntry;
    }

    public String getCacheKey() {
        String url = getUrl();
        int method = getMethod();
        if (method == 0 || method == -1) {
            return url;
        }
        return Integer.toString(method) + '-' + url;
    }

    public l6d.a getErrorListener() {
        l6d.a aVar;
        synchronized (this.mLock) {
            aVar = this.mErrorListener;
        }
        return aVar;
    }

    public Map<String, String> getHeaders() {
        return Collections.EMPTY_MAP;
    }

    public int getMethod() {
        return this.mMethod;
    }

    public Map<String, String> getParams() {
        return null;
    }

    public String getParamsEncoding() {
        return DEFAULT_PARAMS_ENCODING;
    }

    @Deprecated
    public byte[] getPostBody() {
        Map<String, String> postParams = getPostParams();
        if (postParams == null || postParams.size() <= 0) {
            return null;
        }
        return encodeParameters(postParams, getPostParamsEncoding());
    }

    @Deprecated
    public String getPostBodyContentType() {
        return getBodyContentType();
    }

    @Deprecated
    public Map<String, String> getPostParams() {
        return getParams();
    }

    @Deprecated
    public String getPostParamsEncoding() {
        return getParamsEncoding();
    }

    public c getPriority() {
        return c.a;
    }

    public fad getRetryPolicy() {
        return this.mRetryPolicy;
    }

    public final int getSequence() {
        Integer num = this.mSequence;
        if (num != null) {
            return num.intValue();
        }
        r6.g("getSequence called before setSequence");
        return 0;
    }

    public Object getTag() {
        return this.mTag;
    }

    public final int getTimeoutMs() {
        return ((bu0) getRetryPolicy()).a;
    }

    public int getTrafficStatsTag() {
        return this.mDefaultTrafficStatsTag;
    }

    public String getUrl() {
        return this.mUrl;
    }

    public boolean hasHadResponseDelivered() {
        boolean z;
        synchronized (this.mLock) {
            z = this.mResponseDelivered;
        }
        return z;
    }

    public boolean isCanceled() {
        boolean z;
        synchronized (this.mLock) {
            z = this.mCanceled;
        }
        return z;
    }

    public void markDelivered() {
        synchronized (this.mLock) {
            this.mResponseDelivered = true;
        }
    }

    public void notifyListenerResponseNotUsable() {
        b bVar;
        synchronized (this.mLock) {
            bVar = this.mRequestCompleteListener;
        }
        if (bVar != null) {
            ((vtg) bVar).b(this);
        }
    }

    public void notifyListenerResponseReceived(l6d<?> l6dVar) {
        b bVar;
        List list;
        synchronized (this.mLock) {
            bVar = this.mRequestCompleteListener;
        }
        if (bVar != null) {
            vtg vtgVar = (vtg) bVar;
            ts1.a aVar = l6dVar.b;
            if (aVar != null) {
                if (aVar.e >= System.currentTimeMillis()) {
                    String cacheKey = getCacheKey();
                    synchronized (vtgVar) {
                        list = (List) vtgVar.a.remove(cacheKey);
                    }
                    if (list != null) {
                        if (jtg.a) {
                            jtg.d("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(list.size()), cacheKey);
                        }
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            ((r15) vtgVar.b).a((m3d) it.next(), l6dVar, null);
                        }
                        return;
                    }
                    return;
                }
            }
            vtgVar.b(this);
        }
    }

    public VolleyError parseNetworkError(VolleyError volleyError) {
        return volleyError;
    }

    public abstract l6d<T> parseNetworkResponse(wga wgaVar);

    public void sendEvent(int i) {
        o4d o4dVar = this.mRequestQueue;
        if (o4dVar != null) {
            o4dVar.b(this, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public m3d<?> setCacheEntry(ts1.a aVar) {
        this.mCacheEntry = aVar;
        return this;
    }

    public void setNetworkRequestCompleteListener(b bVar) {
        synchronized (this.mLock) {
            this.mRequestCompleteListener = bVar;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public m3d<?> setRequestQueue(o4d o4dVar) {
        this.mRequestQueue = o4dVar;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public m3d<?> setRetryPolicy(fad fadVar) {
        this.mRetryPolicy = fadVar;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final m3d<?> setSequence(int i) {
        this.mSequence = Integer.valueOf(i);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final m3d<?> setShouldCache(boolean z) {
        this.mShouldCache = z;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final m3d<?> setShouldRetryConnectionErrors(boolean z) {
        this.mShouldRetryConnectionErrors = z;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final m3d<?> setShouldRetryServerErrors(boolean z) {
        this.mShouldRetryServerErrors = z;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public m3d<?> setTag(Object obj) {
        this.mTag = obj;
        return this;
    }

    public final boolean shouldCache() {
        return this.mShouldCache;
    }

    public final boolean shouldRetryConnectionErrors() {
        return this.mShouldRetryConnectionErrors;
    }

    public final boolean shouldRetryServerErrors() {
        return this.mShouldRetryServerErrors;
    }

    public String toString() {
        String str = "0x" + Integer.toHexString(getTrafficStatsTag());
        StringBuilder sb = new StringBuilder();
        sb.append(isCanceled() ? "[X] " : "[ ] ");
        sb.append(getUrl());
        sb.append(" ");
        sb.append(str);
        sb.append(" ");
        sb.append(getPriority());
        sb.append(" ");
        sb.append(this.mSequence);
        return sb.toString();
    }

    @Deprecated
    public m3d(String str, l6d.a aVar) {
        this(-1, str, aVar);
    }
}

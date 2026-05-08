package defpackage;

import android.os.SystemClock;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.RCTModernEventEmitter;
import defpackage.ox4;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000b\b&\u0018\u0000 C*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u00020\u0002:\u0002DEB\t\b\u0014¢\u0006\u0004\b\u0003\u0010\u0004B\u0011\b\u0015\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0003\u0010\u0007B\u0019\b\u0014\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0003\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0005H\u0005¢\u0006\u0004\b\u000b\u0010\u0007J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0004¢\u0006\u0004\b\u000b\u0010\u000eJ\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0004¢\u0006\u0004\b\u000b\u0010\tJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0013\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00002\f\u0010\u0012\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0018\u0010\u0004J\r\u0010\u0019\u001a\u00020\n¢\u0006\u0004\b\u0019\u0010\u0004J\u000f\u0010\u001b\u001a\u00020\u001aH&¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001dH\u0017¢\u0006\u0004\b\u001f\u0010 J\u0011\u0010\"\u001a\u0004\u0018\u00010!H\u0014¢\u0006\u0004\b\"\u0010#J\u0011\u0010%\u001a\u0004\u0018\u00010!H\u0000¢\u0006\u0004\b$\u0010#J\u000f\u0010&\u001a\u00020\u0005H\u0014¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020\u0005H\u0000¢\u0006\u0004\b(\u0010'J\u000f\u0010*\u001a\u00020\u000fH\u0014¢\u0006\u0004\b*\u0010\u0011J\u000f\u0010,\u001a\u00020\u000fH\u0000¢\u0006\u0004\b+\u0010\u0011J\u0017\u0010.\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020-H\u0016¢\u0006\u0004\b.\u0010/R$\u00101\u001a\u00020\u000f2\u0006\u00100\u001a\u00020\u000f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b1\u0010\u0011R$\u0010\b\u001a\u00020\u00052\u0006\u00100\u001a\u00020\u00058\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\b\u00103\u001a\u0004\b4\u0010'R$\u0010\u0006\u001a\u00020\u00052\u0006\u00100\u001a\u00020\u00058\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0006\u00103\u001a\u0004\b5\u0010'R$\u0010\r\u001a\u00020\f2\u0006\u00100\u001a\u00020\f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\r\u00106\u001a\u0004\b7\u00108R\u0017\u00109\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b9\u00103\u001a\u0004\b:\u0010'R\u0018\u0010<\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0011\u0010?\u001a\u00020\u001a8G¢\u0006\u0006\u001a\u0004\b>\u0010\u001cR\u0016\u0010B\u001a\u0004\u0018\u00010;8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b@\u0010A¨\u0006F"}, d2 = {"Lox4;", "T", "", "<init>", "()V", "", "viewTag", "(I)V", "surfaceId", "(II)V", "Lj6g;", "init", "", "timestampMs", "(IIJ)V", "", "canCoalesce", "()Z", "otherEvent", "coalesce", "(Lox4;)Lox4;", "", "getCoalescingKey", "()S", "onDispose", "dispose", "", "getEventName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/events/RCTEventEmitter;", "rctEventEmitter", "dispatch", "(Lcom/facebook/react/uimanager/events/RCTEventEmitter;)V", "Lcom/facebook/react/bridge/WritableMap;", "getEventData", "()Lcom/facebook/react/bridge/WritableMap;", "internal_getEventData$ReactAndroid_release", "internal_getEventData", "getEventCategory", "()I", "internal_getEventCategory$ReactAndroid_release", "internal_getEventCategory", "experimental_isSynchronous", "internal_experimental_isSynchronous$ReactAndroid_release", "internal_experimental_isSynchronous", "Lcom/facebook/react/uimanager/events/RCTModernEventEmitter;", "dispatchModern", "(Lcom/facebook/react/uimanager/events/RCTModernEventEmitter;)V", "value", "isInitialized", "Z", "I", "getSurfaceId", "getViewTag", "J", "getTimestampMs", "()J", "uniqueID", "getUniqueID", "Lox4$c;", "eventAnimationDriverMatchSpecCached", "Lox4$c;", "internal_getEventNameCompat", "eventName", "getEventAnimationDriverMatchSpec", "()Lox4$c;", "eventAnimationDriverMatchSpec", "Companion", "c", "b", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class ox4<T extends ox4<T>> {
    private static final b Companion = new b();
    private static int uniqueIdCounter;
    private c eventAnimationDriverMatchSpecCached;
    private boolean isInitialized;
    private int surfaceId;
    private long timestampMs;
    private final int uniqueID;
    private int viewTag;

    public static final class a implements c {
        public final /* synthetic */ ox4<T> a;

        public a(ox4<T> ox4Var) {
            this.a = ox4Var;
        }

        @Override // ox4.c
        public final boolean a(int i, String str) {
            str.getClass();
            ox4<T> ox4Var = this.a;
            return ox4Var.getViewTag() == i && wl7.b(ox4Var.internal_getEventNameCompat(), str);
        }
    }

    public static final class b {
    }

    public interface c {
        boolean a(int i, String str);
    }

    @sy3
    public ox4(int i) {
        int i2 = uniqueIdCounter;
        uniqueIdCounter = i2 + 1;
        this.uniqueID = i2;
        init(i);
    }

    public boolean canCoalesce() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ox4<?> coalesce(ox4<?> otherEvent) {
        return this.timestampMs >= (otherEvent != null ? otherEvent.timestampMs : 0L) ? this : otherEvent;
    }

    @sy3
    public void dispatch(RCTEventEmitter rctEventEmitter) {
        rctEventEmitter.getClass();
        rctEventEmitter.receiveEvent(this.viewTag, internal_getEventNameCompat(), getEventData());
    }

    public void dispatchModern(RCTModernEventEmitter rctEventEmitter) {
        rctEventEmitter.getClass();
        int i = this.surfaceId;
        if (i != -1) {
            rctEventEmitter.receiveEvent(i, this.viewTag, internal_getEventNameCompat(), canCoalesce(), getCoalescingKey(), getEventData(), getEventCategory());
        } else {
            dispatch(rctEventEmitter);
        }
    }

    public final void dispose() {
        this.isInitialized = false;
        onDispose();
    }

    public boolean experimental_isSynchronous() {
        return false;
    }

    public short getCoalescingKey() {
        return (short) 0;
    }

    public c getEventAnimationDriverMatchSpec() {
        if (this.eventAnimationDriverMatchSpecCached == null) {
            this.eventAnimationDriverMatchSpecCached = new a(this);
        }
        return this.eventAnimationDriverMatchSpecCached;
    }

    public int getEventCategory() {
        return 2;
    }

    public WritableMap getEventData() {
        return null;
    }

    public abstract String getEventName();

    public final int getSurfaceId() {
        return this.surfaceId;
    }

    public final long getTimestampMs() {
        return this.timestampMs;
    }

    public final int getUniqueID() {
        return this.uniqueID;
    }

    public final int getViewTag() {
        return this.viewTag;
    }

    public final void init(int surfaceId, int viewTag, long timestampMs) {
        this.surfaceId = surfaceId;
        this.viewTag = viewTag;
        this.timestampMs = timestampMs;
        this.isInitialized = true;
    }

    public final boolean internal_experimental_isSynchronous$ReactAndroid_release() {
        return experimental_isSynchronous();
    }

    public final int internal_getEventCategory$ReactAndroid_release() {
        return getEventCategory();
    }

    public final WritableMap internal_getEventData$ReactAndroid_release() {
        return getEventData();
    }

    public final String internal_getEventNameCompat() {
        return getEventName();
    }

    /* JADX INFO: renamed from: isInitialized, reason: from getter */
    public final boolean getIsInitialized() {
        return this.isInitialized;
    }

    public void onDispose() {
    }

    @sy3
    public final void init(int viewTag) {
        init(-1, viewTag);
    }

    public final void init(int surfaceId, int viewTag) {
        init(surfaceId, viewTag, SystemClock.uptimeMillis());
    }

    public ox4() {
        int i = uniqueIdCounter;
        uniqueIdCounter = i + 1;
        this.uniqueID = i;
    }

    public ox4(int i, int i2) {
        int i3 = uniqueIdCounter;
        uniqueIdCounter = i3 + 1;
        this.uniqueID = i3;
        init(i, i2);
    }
}

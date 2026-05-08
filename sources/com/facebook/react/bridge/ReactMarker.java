package com.facebook.react.bridge;

import android.os.SystemClock;
import com.datadog.android.ndk.internal.NdkCrashLog;
import defpackage.f84;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001:\u0003678B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u0003J\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000f\u0010\u0003J9\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ1\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u0019\u0010\u001bJ)\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0019\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u001d\u0010\u001fJ!\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0007¢\u0006\u0004\b\u001d\u0010 J)\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u001d\u0010!J\u0017\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u001d\u0010\"J\u001f\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u001d\u0010#J!\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0007¢\u0006\u0004\b\u001d\u0010$J\u001f\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010%\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u001d\u0010&J)\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u001d\u0010\u001cJ3\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010%\u001a\u0004\u0018\u00010\u0016H\u0007¢\u0006\u0004\b\u001d\u0010'J!\u0010(\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010%\u001a\u0004\u0018\u00010\u0016H\u0003¢\u0006\u0004\b(\u0010)J \u0010,\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00122\u0006\u0010+\u001a\u00020\u0016H\u0083 ¢\u0006\u0004\b,\u0010-R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020/0.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020\u0004028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u001a\u00105\u001a\b\u0012\u0004\u0012\u00020\u000b028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00104¨\u00069"}, d2 = {"Lcom/facebook/react/bridge/ReactMarker;", "", "<init>", "()V", "Lcom/facebook/react/bridge/ReactMarker$MarkerListener;", "listener", "Lj6g;", "addListener", "(Lcom/facebook/react/bridge/ReactMarker$MarkerListener;)V", "removeListener", "clearMarkerListeners", "Lcom/facebook/react/bridge/ReactMarker$FabricMarkerListener;", "addFabricListener", "(Lcom/facebook/react/bridge/ReactMarker$FabricMarkerListener;)V", "removeFabricListener", "clearFabricMarkerListeners", "Lcom/facebook/react/bridge/ReactMarkerConstants;", "name", "", "tag", "", "instanceKey", "", NdkCrashLog.TIMESTAMP_KEY_NAME, "counter", "logFabricMarker", "(Lcom/facebook/react/bridge/ReactMarkerConstants;Ljava/lang/String;IJI)V", "(Lcom/facebook/react/bridge/ReactMarkerConstants;Ljava/lang/String;IJ)V", "(Lcom/facebook/react/bridge/ReactMarkerConstants;Ljava/lang/String;I)V", "logMarker", "(Ljava/lang/String;)V", "(Ljava/lang/String;I)V", "(Ljava/lang/String;Ljava/lang/String;)V", "(Ljava/lang/String;Ljava/lang/String;I)V", "(Lcom/facebook/react/bridge/ReactMarkerConstants;)V", "(Lcom/facebook/react/bridge/ReactMarkerConstants;I)V", "(Lcom/facebook/react/bridge/ReactMarkerConstants;Ljava/lang/String;)V", "time", "(Lcom/facebook/react/bridge/ReactMarkerConstants;J)V", "(Lcom/facebook/react/bridge/ReactMarkerConstants;Ljava/lang/String;ILjava/lang/Long;)V", "notifyNativeMarker", "(Lcom/facebook/react/bridge/ReactMarkerConstants;Ljava/lang/Long;)V", "markerName", "markerTime", "nativeLogMarker", "(Ljava/lang/String;J)V", "Ljava/util/Queue;", "Lcom/facebook/react/bridge/ReactMarker$ReactMarkerRecord;", "nativeReactMarkerQueue", "Ljava/util/Queue;", "", "listeners", "Ljava/util/List;", "fabricMarkerListeners", "ReactMarkerRecord", "MarkerListener", "FabricMarkerListener", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@f84
public final class ReactMarker {
    public static final ReactMarker INSTANCE = new ReactMarker();
    private static final Queue<ReactMarkerRecord> nativeReactMarkerQueue = new ConcurrentLinkedQueue();
    private static final List<MarkerListener> listeners = new CopyOnWriteArrayList();
    private static final List<FabricMarkerListener> fabricMarkerListeners = new CopyOnWriteArrayList();

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J1\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\fJ9\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\u000eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, d2 = {"Lcom/facebook/react/bridge/ReactMarker$FabricMarkerListener;", "", "Lcom/facebook/react/bridge/ReactMarkerConstants;", "name", "", "tag", "", "instanceKey", "", NdkCrashLog.TIMESTAMP_KEY_NAME, "Lj6g;", "logFabricMarker", "(Lcom/facebook/react/bridge/ReactMarkerConstants;Ljava/lang/String;IJ)V", "counter", "(Lcom/facebook/react/bridge/ReactMarkerConstants;Ljava/lang/String;IJI)V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface FabricMarkerListener {
        void logFabricMarker(ReactMarkerConstants name, String tag, int instanceKey, long timestamp);

        default void logFabricMarker(ReactMarkerConstants name, String tag, int instanceKey, long timestamp, int counter) {
            name.getClass();
            logFabricMarker(name, tag, instanceKey, timestamp);
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J)\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lcom/facebook/react/bridge/ReactMarker$MarkerListener;", "", "Lcom/facebook/react/bridge/ReactMarkerConstants;", "name", "", "tag", "", "instanceKey", "Lj6g;", "logMarker", "(Lcom/facebook/react/bridge/ReactMarkerConstants;Ljava/lang/String;I)V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface MarkerListener {
        void logMarker(ReactMarkerConstants name, String tag, int instanceKey);
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/facebook/react/bridge/ReactMarker$ReactMarkerRecord;", "", "markerName", "", "markerTime", "", "<init>", "(Ljava/lang/String;J)V", "getMarkerName", "()Ljava/lang/String;", "getMarkerTime", "()J", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ReactMarkerRecord {
        private final String markerName;
        private final long markerTime;

        public ReactMarkerRecord(String str, long j) {
            str.getClass();
            this.markerName = str;
            this.markerTime = j;
        }

        public final String getMarkerName() {
            return this.markerName;
        }

        public final long getMarkerTime() {
            return this.markerTime;
        }
    }

    private ReactMarker() {
    }

    @f84
    public static final void addFabricListener(FabricMarkerListener listener) {
        listener.getClass();
        List<FabricMarkerListener> list = fabricMarkerListeners;
        if (list.contains(listener)) {
            return;
        }
        list.add(listener);
    }

    @f84
    public static final void addListener(MarkerListener listener) {
        listener.getClass();
        List<MarkerListener> list = listeners;
        if (list.contains(listener)) {
            return;
        }
        list.add(listener);
    }

    @f84
    public static final void clearFabricMarkerListeners() {
        fabricMarkerListeners.clear();
    }

    @f84
    public static final void clearMarkerListeners() {
        listeners.clear();
    }

    @f84
    public static final void logFabricMarker(ReactMarkerConstants name, String tag, int instanceKey, long timestamp, int counter) {
        name.getClass();
        Iterator<FabricMarkerListener> it = fabricMarkerListeners.iterator();
        while (it.hasNext()) {
            it.next().logFabricMarker(name, tag, instanceKey, timestamp, counter);
        }
    }

    @f84
    public static final void logMarker(ReactMarkerConstants name, String tag, int instanceKey, Long time) {
        name.getClass();
        logFabricMarker(name, tag, instanceKey);
        Iterator<MarkerListener> it = listeners.iterator();
        while (it.hasNext()) {
            it.next().logMarker(name, tag, instanceKey);
        }
        notifyNativeMarker(name, time);
    }

    @f84
    private static final native void nativeLogMarker(String markerName, long markerTime);

    @f84
    private static final void notifyNativeMarker(ReactMarkerConstants name, Long time) {
        if (!name.getHasMatchingNameMarker()) {
            return;
        }
        long jLongValue = time != null ? time.longValue() : SystemClock.uptimeMillis();
        if (!ReactNativeJniCommonSoLoader.isInitialized()) {
            nativeReactMarkerQueue.add(new ReactMarkerRecord(name.name(), jLongValue));
            return;
        }
        nativeLogMarker(name.name(), jLongValue);
        while (true) {
            ReactMarkerRecord reactMarkerRecordPoll = nativeReactMarkerQueue.poll();
            if (reactMarkerRecordPoll == null) {
                return;
            } else {
                nativeLogMarker(reactMarkerRecordPoll.getMarkerName(), reactMarkerRecordPoll.getMarkerTime());
            }
        }
    }

    @f84
    public static final void removeFabricListener(FabricMarkerListener listener) {
        listener.getClass();
        fabricMarkerListeners.remove(listener);
    }

    @f84
    public static final void removeListener(MarkerListener listener) {
        listener.getClass();
        listeners.remove(listener);
    }

    @f84
    public static final void logFabricMarker(ReactMarkerConstants name, String tag, int instanceKey, long timestamp) {
        name.getClass();
        Iterator<FabricMarkerListener> it = fabricMarkerListeners.iterator();
        while (it.hasNext()) {
            it.next().logFabricMarker(name, tag, instanceKey, timestamp, 0);
        }
    }

    @f84
    public static final void logMarker(String name, int instanceKey) {
        name.getClass();
        logMarker(name, (String) null, instanceKey);
    }

    @f84
    public static final void logMarker(String name, String tag) {
        name.getClass();
        logMarker(name, tag, 0);
    }

    @f84
    public static final void logFabricMarker(ReactMarkerConstants name, String tag, int instanceKey) {
        name.getClass();
        logFabricMarker(name, tag, instanceKey, SystemClock.uptimeMillis(), 0);
    }

    @f84
    public static final void logMarker(String name, String tag, int instanceKey) {
        name.getClass();
        logMarker(ReactMarkerConstants.valueOf(name), tag, instanceKey);
    }

    @f84
    public static final void logMarker(ReactMarkerConstants name) {
        name.getClass();
        logMarker(name, (String) null, 0);
    }

    @f84
    public static final void logMarker(ReactMarkerConstants name, int instanceKey) {
        name.getClass();
        logMarker(name, (String) null, instanceKey);
    }

    @f84
    public static final void logMarker(ReactMarkerConstants name, String tag) {
        name.getClass();
        logMarker(name, tag, 0);
    }

    @f84
    public static final void logMarker(ReactMarkerConstants name, long time) {
        name.getClass();
        logMarker(name, null, 0, Long.valueOf(time));
    }

    @f84
    public static final void logMarker(ReactMarkerConstants name, String tag, int instanceKey) {
        name.getClass();
        logMarker(name, tag, instanceKey, null);
    }

    @f84
    public static final void logMarker(String name) {
        name.getClass();
        logMarker(name, (String) null);
    }
}

package com.facebook.react.bridge;

import com.facebook.jni.HybridData;
import defpackage.f84;
import defpackage.l5;
import defpackage.s55;
import defpackage.ut0;
import defpackage.zr4;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0004\u0010\u0011\u0012\u0013B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0082 ¢\u0006\u0002\u0010\tJ\u001b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0082 R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/facebook/react/bridge/Inspector;", "", "mHybridData", "Lcom/facebook/jni/HybridData;", "<init>", "(Lcom/facebook/jni/HybridData;)V", "getPagesNative", "", "Lcom/facebook/react/bridge/Inspector$Page;", "()[Lcom/facebook/react/bridge/Inspector$Page;", "connectNative", "Lcom/facebook/react/bridge/Inspector$LocalConnection;", "pageId", "", "remote", "Lcom/facebook/react/bridge/Inspector$RemoteConnection;", "Page", "RemoteConnection", "LocalConnection", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@f84
public final class Inspector {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final HybridData mHybridData;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086 ¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\bH\u0086 ¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/facebook/react/bridge/Inspector$LocalConnection;", "", "Lcom/facebook/jni/HybridData;", "mHybridData", "<init>", "(Lcom/facebook/jni/HybridData;)V", "", "message", "Lj6g;", "sendMessage", "(Ljava/lang/String;)V", "disconnect", "()V", "Lcom/facebook/jni/HybridData;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @f84
    public static final class LocalConnection {
        private final HybridData mHybridData;

        private LocalConnection(HybridData hybridData) {
            this.mHybridData = hybridData;
        }

        public final native void disconnect();

        public final native void sendMessage(String message);
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B!\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\t\u001a\u00020\u0003J\u0006\u0010\n\u001a\u00020\u0005J\u0006\u0010\u000b\u001a\u00020\u0005J\b\u0010\f\u001a\u00020\u0005H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/facebook/react/bridge/Inspector$Page;", "", "id", "", "title", "", "vm", "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "getId", "getTitle", "getVM", "toString", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @f84
    public static final class Page {
        private final int id;
        private final String title;
        private final String vm;

        private Page(int i, String str, String str2) {
            this.id = i;
            this.title = str;
            this.vm = str2;
        }

        public final int getId() {
            return this.id;
        }

        public final String getTitle() {
            return this.title;
        }

        /* JADX INFO: renamed from: getVM, reason: from getter */
        public final String getVm() {
            return this.vm;
        }

        public String toString() {
            return "Page{id=" + this.id + ", title='" + this.title + "'}";
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H'¢\u0006\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Lcom/facebook/react/bridge/Inspector$RemoteConnection;", "", "", "message", "Lj6g;", "onMessage", "(Ljava/lang/String;)V", "onDisconnect", "()V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @f84
    public interface RemoteConnection {
        @f84
        void onDisconnect();

        @f84
        void onMessage(String message);
    }

    static {
        BridgeSoLoader.staticInit();
    }

    private Inspector(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public static final LocalConnection connect(int i, RemoteConnection remoteConnection) {
        return INSTANCE.connect(i, remoteConnection);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final native LocalConnection connectNative(int pageId, RemoteConnection remote);

    public static final List<Page> getPages() {
        return INSTANCE.getPages();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final native Page[] getPagesNative();

    /* JADX INFO: Access modifiers changed from: private */
    public static final native Inspector instance();

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\t\u0010\r\u001a\u00020\u000eH\u0083 ¨\u0006\u000f"}, d2 = {"Lcom/facebook/react/bridge/Inspector$Companion;", "", "<init>", "()V", "getPages", "", "Lcom/facebook/react/bridge/Inspector$Page;", "connect", "Lcom/facebook/react/bridge/Inspector$LocalConnection;", "pageId", "", "remote", "Lcom/facebook/react/bridge/Inspector$RemoteConnection;", "instance", "Lcom/facebook/react/bridge/Inspector;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Inspector instance() {
            return Inspector.instance();
        }

        public final LocalConnection connect(int pageId, RemoteConnection remote) {
            remote.getClass();
            try {
                LocalConnection localConnectionConnectNative = instance().connectNative(pageId, remote);
                if (localConnectionConnectNative != null) {
                    return localConnectionConnectNative;
                }
                throw new IllegalStateException("Can't open failed connection");
            } catch (UnsatisfiedLinkError e) {
                s55.g("ReactNative", "Inspector doesn't work in open source yet", e);
                l5.r(e);
                return null;
            }
        }

        public final List<Page> getPages() {
            try {
                return ut0.E0(instance().getPagesNative());
            } catch (UnsatisfiedLinkError e) {
                s55.g("ReactNative", "Inspector doesn't work in open source yet", e);
                return zr4.a;
            }
        }

        private Companion() {
        }
    }
}

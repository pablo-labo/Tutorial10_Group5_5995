package com.facebook.react.modules.clipboard;

import android.content.ClipData;
import android.content.ClipboardManager;
import com.datadog.android.rum.internal.domain.event.RumEventSerializer;
import com.facebook.fbreact.specs.NativeClipboardSpec;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import defpackage.nmc;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@nmc(name = "Clipboard")
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \u00132\u00020\u0001:\u0001\u0014B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/facebook/react/modules/clipboard/ClipboardModule;", "Lcom/facebook/fbreact/specs/NativeClipboardSpec;", "Lcom/facebook/react/bridge/ReactApplicationContext;", RumEventSerializer.GLOBAL_ATTRIBUTE_PREFIX, "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "Lj6g;", "getString", "(Lcom/facebook/react/bridge/Promise;)V", "", "text", "setString", "(Ljava/lang/String;)V", "Landroid/content/ClipboardManager;", "getClipboardService", "()Landroid/content/ClipboardManager;", "clipboardService", "Companion", "a", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ClipboardModule extends NativeClipboardSpec {
    public static final String NAME = "Clipboard";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClipboardModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        reactApplicationContext.getClass();
    }

    private final ClipboardManager getClipboardService() {
        Object systemService = getReactApplicationContext().getSystemService("clipboard");
        systemService.getClass();
        return (ClipboardManager) systemService;
    }

    @Override // com.facebook.fbreact.specs.NativeClipboardSpec
    public void getString(Promise promise) {
        promise.getClass();
        try {
            ClipData primaryClip = getClipboardService().getPrimaryClip();
            if (primaryClip == null || primaryClip.getItemCount() < 1) {
                promise.resolve("");
            } else {
                promise.resolve(String.valueOf(primaryClip.getItemAt(0).getText()));
            }
        } catch (Exception e) {
            promise.reject(e);
        }
    }

    @Override // com.facebook.fbreact.specs.NativeClipboardSpec
    public void setString(String text) {
        ClipData clipDataNewPlainText = ClipData.newPlainText(null, text);
        clipDataNewPlainText.getClass();
        getClipboardService().setPrimaryClip(clipDataNewPlainText);
    }
}

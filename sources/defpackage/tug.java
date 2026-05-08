package defpackage;

import android.net.Uri;
import android.webkit.WebView;
import com.datadog.android.rum.internal.utils.ViewUtilsKt;
import defpackage.uwg;
import java.lang.reflect.InvocationHandler;
import java.util.Objects;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
public final class tug implements WebMessageListenerBoundaryInterface {
    public final uwg.a a;

    public tug(xbc xbcVar) {
        this.a = xbcVar;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public final String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_LISTENER", "WEB_MESSAGE_ARRAY_BUFFER"};
    }

    @Override // org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface
    public final void onPostMessage(WebView webView, InvocationHandler invocationHandler, Uri uri, boolean z, InvocationHandler invocationHandler2) {
        xeb xebVar;
        WebMessageBoundaryInterface webMessageBoundaryInterface = (WebMessageBoundaryInterface) al1.a(WebMessageBoundaryInterface.class, invocationHandler);
        InvocationHandler[] ports = webMessageBoundaryInterface.getPorts();
        v1[] v1VarArr = new v1[ports.length];
        int i = 0;
        for (int i2 = 0; i2 < ports.length; i2++) {
            InvocationHandler invocationHandler3 = ports[i2];
            uug uugVar = new uug();
            uugVar.b = (WebMessagePortBoundaryInterface) al1.a(WebMessagePortBoundaryInterface.class, invocationHandler3);
            v1VarArr[i2] = uugVar;
        }
        if (xwg.a.d()) {
            WebMessagePayloadBoundaryInterface webMessagePayloadBoundaryInterface = (WebMessagePayloadBoundaryInterface) al1.a(WebMessagePayloadBoundaryInterface.class, webMessageBoundaryInterface.getMessagePayload());
            int type = webMessagePayloadBoundaryInterface.getType();
            if (type != 0) {
                xebVar = null;
                if (type == 1) {
                    byte[] asArrayBuffer = webMessagePayloadBoundaryInterface.getAsArrayBuffer();
                    xeb xebVar2 = new xeb();
                    Objects.requireNonNull(asArrayBuffer);
                    xebVar2.b = null;
                    xebVar2.a = 1;
                    xebVar = xebVar2;
                }
            } else {
                xebVar = new xeb(webMessagePayloadBoundaryInterface.getAsString());
            }
        } else {
            xebVar = new xeb(webMessageBoundaryInterface.getData());
        }
        if (xebVar != null) {
            JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface = (JsReplyProxyBoundaryInterface) al1.a(JsReplyProxyBoundaryInterface.class, invocationHandler2);
            wbc wbcVar = ((xbc) this.a).a;
            int i3 = xebVar.a;
            if (i3 != 0) {
                throw new IllegalStateException(m6.h(new StringBuilder("Wrong data accessor type detected. "), i3 != 0 ? i3 != 1 ? ViewUtilsKt.UNKNOWN_DESTINATION_URL : "ArrayBuffer" : "String", " expected, but got ", "String"));
            }
            wbcVar.c((String) xebVar.b, uri.toString());
        }
    }
}

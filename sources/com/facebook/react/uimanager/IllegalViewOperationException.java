package com.facebook.react.uimanager;

import android.view.View;
import com.facebook.react.bridge.JSApplicationCausedNativeException;
import defpackage.wnc;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/facebook/react/uimanager/IllegalViewOperationException;", "Lcom/facebook/react/bridge/JSApplicationCausedNativeException;", "Landroid/view/View;", "view", "Landroid/view/View;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class IllegalViewOperationException extends JSApplicationCausedNativeException {
    private View view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IllegalViewOperationException(String str, wnc wncVar, StackOverflowError stackOverflowError) {
        super(str, stackOverflowError);
        str.getClass();
        this.view = wncVar;
    }
}

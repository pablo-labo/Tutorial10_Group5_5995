package defpackage;

import android.view.View;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.BaseViewManager;

/* JADX INFO: loaded from: classes2.dex */
public final class ui3 extends o81 {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ui3(BaseViewManager baseViewManager, int i) {
        super(baseViewManager);
        this.d = i;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.o81, defpackage.sqg
    /* JADX INFO: renamed from: m */
    public void a(View view, String str, Object obj) {
        switch (this.d) {
            case 1:
                View.OnLayoutChangeListener onLayoutChangeListener = (BaseViewManager) this.c;
                str.getClass();
                byte b = -1;
                switch (str.hashCode()) {
                    case -1221029593:
                        if (str.equals("height")) {
                            b = 0;
                        }
                        break;
                    case -934426595:
                        if (str.equals("result")) {
                            b = 1;
                        }
                        break;
                    case -823812830:
                        if (str.equals("values")) {
                            b = 2;
                        }
                        break;
                    case 120:
                        if (str.equals("x")) {
                            b = 3;
                        }
                        break;
                    case 121:
                        if (str.equals("y")) {
                            b = 4;
                        }
                        break;
                    case 104364:
                        if (str.equals("in1")) {
                            b = 5;
                        }
                        break;
                    case 3575610:
                        if (str.equals("type")) {
                            b = 6;
                        }
                        break;
                    case 113126854:
                        if (str.equals("width")) {
                            b = 7;
                        }
                        break;
                }
                switch (b) {
                    case 0:
                        ((ofc) onLayoutChangeListener).setHeight(view, new DynamicFromObject(obj));
                        break;
                    case 1:
                        ((ofc) onLayoutChangeListener).setResult(view, obj != null ? (String) obj : null);
                        break;
                    case 2:
                        ((ofc) onLayoutChangeListener).setValues(view, (ReadableArray) obj);
                        break;
                    case 3:
                        ((ofc) onLayoutChangeListener).setX(view, new DynamicFromObject(obj));
                        break;
                    case 4:
                        ((ofc) onLayoutChangeListener).setY(view, new DynamicFromObject(obj));
                        break;
                    case 5:
                        ((ofc) onLayoutChangeListener).setIn1(view, obj != null ? (String) obj : null);
                        break;
                    case 6:
                        ((ofc) onLayoutChangeListener).setType(view, (String) obj);
                        break;
                    case 7:
                        ((ofc) onLayoutChangeListener).setWidth(view, new DynamicFromObject(obj));
                        break;
                    default:
                        super.a(view, str, obj);
                        break;
                }
                break;
            default:
                super.a(view, str, obj);
                break;
        }
    }

    @Override // defpackage.o81, defpackage.sqg
    /* JADX INFO: renamed from: s */
    public void f(View view, String str, ReadableArray readableArray) {
        View.OnLayoutChangeListener onLayoutChangeListener;
        switch (this.d) {
            case 0:
                onLayoutChangeListener = (BaseViewManager) this.c;
                str.getClass();
                switch (str) {
                    case "clearElementsHighlights":
                        ((vi3) onLayoutChangeListener).clearElementsHighlights(view);
                        break;
                    case "highlightTraceUpdates":
                        ((vi3) onLayoutChangeListener).highlightTraceUpdates(view, readableArray.getArray(0));
                        break;
                    case "highlightElements":
                        ((vi3) onLayoutChangeListener).highlightElements(view, readableArray.getArray(0));
                        break;
                }
                break;
            default:
                super.f(view, str, readableArray);
                break;
        }
    }
}

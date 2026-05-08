package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import com.facebook.react.bridge.UiThreadUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ti3 extends View {
    public final Paint a;
    public final HashMap<Integer, opf> b;
    public final HashMap<Integer, Runnable> c;
    public final Paint d;
    public List<RectF> e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ti3(mkf mkfVar) {
        super(mkfVar);
        mkfVar.getClass();
        Paint paint = new Paint();
        this.a = paint;
        this.b = new HashMap<>();
        this.c = new HashMap<>();
        Paint paint2 = new Paint();
        this.d = paint2;
        this.e = new ArrayList();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(6.0f);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(-859248897);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        super.onDraw(canvas);
        for (opf opfVar : this.b.values()) {
            opfVar.getClass();
            opf opfVar2 = opfVar;
            int i = opfVar2.c;
            Paint paint = this.a;
            paint.setColor(i);
            canvas.drawRect(opfVar2.b, paint);
            final int i2 = opfVar2.a;
            Runnable runnable = new Runnable() { // from class: si3
                @Override // java.lang.Runnable
                public final void run() {
                    ti3 ti3Var = this.a;
                    HashMap<Integer, opf> map = ti3Var.b;
                    int i3 = i2;
                    map.remove(Integer.valueOf(i3));
                    ti3Var.c.remove(Integer.valueOf(i3));
                    ti3Var.invalidate();
                }
            };
            Integer numValueOf = Integer.valueOf(i2);
            HashMap<Integer, Runnable> map = this.c;
            if (!map.containsKey(numValueOf)) {
                map.put(Integer.valueOf(i2), runnable);
                UiThreadUtil.runOnUiThread(runnable, 2000L);
            }
        }
        Iterator<RectF> it = this.e.iterator();
        while (it.hasNext()) {
            canvas.drawRect(it.next(), this.d);
        }
    }

    public final void setHighlightedElementsRectangles(List<RectF> list) {
        list.getClass();
        this.e = list;
        invalidate();
    }

    public final void setTraceUpdates(List<opf> list) {
        list.getClass();
        for (opf opfVar : list) {
            int i = opfVar.a;
            Integer numValueOf = Integer.valueOf(i);
            HashMap<Integer, Runnable> map = this.c;
            if (map.containsKey(numValueOf)) {
                Runnable runnable = map.get(Integer.valueOf(i));
                if (runnable != null) {
                    UiThreadUtil.removeOnUiThread(runnable);
                }
                map.remove(Integer.valueOf(i));
            }
            this.b.put(Integer.valueOf(i), opfVar);
        }
        invalidate();
    }
}

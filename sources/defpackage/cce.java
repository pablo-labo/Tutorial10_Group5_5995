package defpackage;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;

/* JADX INFO: loaded from: classes2.dex */
public final class cce implements SensorEventListener {
    public final r20 a;
    public float b;
    public float c;
    public float d;
    public SensorManager e;
    public long f;
    public int g;
    public long h;

    public cce(r20 r20Var) {
        this.a = r20Var;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
        sensor.getClass();
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        sensorEvent.getClass();
        long j = sensorEvent.timestamp;
        if (j - this.f < 20000000) {
            return;
        }
        float[] fArr = sensorEvent.values;
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2] - 9.80665f;
        this.f = j;
        if (Math.abs(f) > 13.042845f && this.b * f <= 0.0f) {
            this.h = sensorEvent.timestamp;
            this.g++;
            this.b = f;
        } else if (Math.abs(f2) > 13.042845f && this.c * f2 <= 0.0f) {
            this.h = sensorEvent.timestamp;
            this.g++;
            this.c = f2;
        } else if (Math.abs(f3) > 13.042845f && this.d * f3 <= 0.0f) {
            this.h = sensorEvent.timestamp;
            this.g++;
            this.d = f3;
        }
        long j2 = sensorEvent.timestamp;
        if (this.g >= 16) {
            this.g = 0;
            this.b = 0.0f;
            this.c = 0.0f;
            this.d = 0.0f;
            ((ym1) this.a.b).A();
        }
        if (j2 - this.h > 3.0E9f) {
            this.g = 0;
            this.b = 0.0f;
            this.c = 0.0f;
            this.d = 0.0f;
        }
    }
}

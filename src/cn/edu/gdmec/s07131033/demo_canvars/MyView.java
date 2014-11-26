package cn.edu.gdmec.s07131033.demo_canvars;

import android.R.color;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class MyView extends View {

	public MyView(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}
	@Override
	protected void onDraw(Canvas canvas) {
		// TODO Auto-generated method stub
		super.onDraw(canvas);
		canvas.drawColor(Color.GRAY);
		Paint paint = new Paint();
		paint.setColor(Color.BLACK);
		canvas.drawCircle(100, 100, 50, paint);
		
		paint.setColor(Color.GREEN);
		paint.setStrokeWidth(10);
		canvas.drawRect(200, 200, 300, 300, paint);
		
		paint.setTextSize(50);
		paint.setColor(Color.BLUE);
		canvas.drawText("Hello Girl", 200, 400, paint);
	}
}

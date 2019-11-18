package run.java.com.javarunprogram.android.fragments;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import run.java.com.javarunprogram.R;


/**
 * @author dipenp
 *
 */
public class FragmentThree extends Fragment{

	private String TAG = FragmentThree.class.getSimpleName();
	
	Context _context;
	
	public FragmentThree() {
		Log.d(TAG, "FragmentThree Constructer");
	}
	
//	public FragmentThree(LauncherActivity launcherActivity) {
//		_context = launcherActivity;
//		Log.d(TAG, "FragmentThree Constructer with paramerer");
//	}
	
	@Override
	public void onAttach(Activity activity) {
		super.onAttach(activity);
		Log.d(TAG, "onAttach");
	}
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.d(TAG, "onCreate");
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		Log.d(TAG, "onCreateView");
		View rootView = inflater.inflate(R.layout.fragment_three_layout, container, false);
		return rootView;
	}
	
	@Override
	public void onViewCreated(View view, Bundle savedInstanceState) {
		Log.d(TAG, "onViewCreated");
		TextView tv = (TextView)view.findViewById(R.id.textView);
		super.onViewCreated(view, savedInstanceState);
	}
	
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		Log.d(TAG, "onActivityCreated");
	}
	
	@Override
	public void onStart() {
		super.onStart();
		Log.d(TAG, "onStart");
	}
	
	@Override
	public void onResume() {
		super.onResume();
		Log.d(TAG, "onResume");
	}
	
	@Override
	public void onPause() {
		super.onPause();
		Log.d(TAG, "onPause");
	}
	
	@Override
	public void onStop() {
		super.onStop();
		Log.d(TAG, "onStop");
	}
	
	@Override
	public void onDestroyView() {
		super.onDestroyView();
		Log.d(TAG, "onDestroyView");
	}
	
	@Override
	public void onDestroy() {
		super.onDestroy();
		Log.d(TAG, "onDestroy");
	}
	
	@Override
	public void onDetach() {
		super.onDetach();
		Log.d(TAG, "onDetach");
	}
}

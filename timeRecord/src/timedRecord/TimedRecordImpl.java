package timedRecord;

public class TimedRecordImpl implements TimedRecord {

	long start;
	
	long end;
	
	public TimedRecordImpl(long start, long end) {
		super();
		this.start = start;
		this.end = end;
	}

	@Override
	public long getStart() {
		// TODO Auto-generated method stub
		return this.start;
	}

	@Override
	public long getEnd() {
		// TODO Auto-generated method stub
		return this.end;
	}

	@Override
	public String toString() {
		return "TimedRecordImpl [start=" + start + ", end=" + end + "]";
	}

	
}

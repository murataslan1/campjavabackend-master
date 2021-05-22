package kodlamaio.northwind.core.utilities.results;

public class SuccessDataResult<T> extends DataResult<T> {

	public SuccessDataResult(T data, String message) {//Başarılı sonuç dönerse bana bunları ver demektir.
		super(data, true ,message);
	}
	
	public SuccessDataResult(T data) {//Başarılı sonuç dönerse bana sadece bunu  ver demektir.
		super(data,true);
	}
	
	public SuccessDataResult(String message) {//Başarılı sonuç dönerse bana sadece bunu  ver demektir.
		super(null, true ,message);
	}
	
	public SuccessDataResult() {//Başarılı sonuç dönerse bana sadece bunu  ver demektir.
		super(null, true);
	}

}

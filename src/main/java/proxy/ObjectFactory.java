
package proxy;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the proxy package. 
 * <p>An ObjectFactory allows you to programmatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private static final QName _AddProduct_QNAME = new QName("http://webservice.example.org/", "addProduct");
    private static final QName _AddProductResponse_QNAME = new QName("http://webservice.example.org/", "addProductResponse");
    private static final QName _DeleteProduct_QNAME = new QName("http://webservice.example.org/", "deleteProduct");
    private static final QName _DeleteProductResponse_QNAME = new QName("http://webservice.example.org/", "deleteProductResponse");
    private static final QName _GetProduct_QNAME = new QName("http://webservice.example.org/", "getProduct");
    private static final QName _GetProductResponse_QNAME = new QName("http://webservice.example.org/", "getProductResponse");
    private static final QName _Product_QNAME = new QName("http://webservice.example.org/", "product");
    private static final QName _ProductList_QNAME = new QName("http://webservice.example.org/", "productList");
    private static final QName _ProductListResponse_QNAME = new QName("http://webservice.example.org/", "productListResponse");
    private static final QName _SellingPrice_QNAME = new QName("http://webservice.example.org/", "sellingPrice");
    private static final QName _SellingPriceResponse_QNAME = new QName("http://webservice.example.org/", "sellingPriceResponse");
    private static final QName _UpdateProduct_QNAME = new QName("http://webservice.example.org/", "updateProduct");
    private static final QName _UpdateProductResponse_QNAME = new QName("http://webservice.example.org/", "updateProductResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: proxy
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddProduct }
     * 
     * @return
     *     the new instance of {@link AddProduct }
     */
    public AddProduct createAddProduct() {
        return new AddProduct();
    }

    /**
     * Create an instance of {@link AddProductResponse }
     * 
     * @return
     *     the new instance of {@link AddProductResponse }
     */
    public AddProductResponse createAddProductResponse() {
        return new AddProductResponse();
    }

    /**
     * Create an instance of {@link DeleteProduct }
     * 
     * @return
     *     the new instance of {@link DeleteProduct }
     */
    public DeleteProduct createDeleteProduct() {
        return new DeleteProduct();
    }

    /**
     * Create an instance of {@link DeleteProductResponse }
     * 
     * @return
     *     the new instance of {@link DeleteProductResponse }
     */
    public DeleteProductResponse createDeleteProductResponse() {
        return new DeleteProductResponse();
    }

    /**
     * Create an instance of {@link GetProduct }
     * 
     * @return
     *     the new instance of {@link GetProduct }
     */
    public GetProduct createGetProduct() {
        return new GetProduct();
    }

    /**
     * Create an instance of {@link GetProductResponse }
     * 
     * @return
     *     the new instance of {@link GetProductResponse }
     */
    public GetProductResponse createGetProductResponse() {
        return new GetProductResponse();
    }

    /**
     * Create an instance of {@link Product }
     * 
     * @return
     *     the new instance of {@link Product }
     */
    public Product createProduct() {
        return new Product();
    }

    /**
     * Create an instance of {@link ProductList }
     * 
     * @return
     *     the new instance of {@link ProductList }
     */
    public ProductList createProductList() {
        return new ProductList();
    }

    /**
     * Create an instance of {@link ProductListResponse }
     * 
     * @return
     *     the new instance of {@link ProductListResponse }
     */
    public ProductListResponse createProductListResponse() {
        return new ProductListResponse();
    }

    /**
     * Create an instance of {@link SellingPrice }
     * 
     * @return
     *     the new instance of {@link SellingPrice }
     */
    public SellingPrice createSellingPrice() {
        return new SellingPrice();
    }

    /**
     * Create an instance of {@link SellingPriceResponse }
     * 
     * @return
     *     the new instance of {@link SellingPriceResponse }
     */
    public SellingPriceResponse createSellingPriceResponse() {
        return new SellingPriceResponse();
    }

    /**
     * Create an instance of {@link UpdateProduct }
     * 
     * @return
     *     the new instance of {@link UpdateProduct }
     */
    public UpdateProduct createUpdateProduct() {
        return new UpdateProduct();
    }

    /**
     * Create an instance of {@link UpdateProductResponse }
     * 
     * @return
     *     the new instance of {@link UpdateProductResponse }
     */
    public UpdateProductResponse createUpdateProductResponse() {
        return new UpdateProductResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddProduct }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddProduct }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.example.org/", name = "addProduct")
    public JAXBElement<AddProduct> createAddProduct(AddProduct value) {
        return new JAXBElement<>(_AddProduct_QNAME, AddProduct.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddProductResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddProductResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.example.org/", name = "addProductResponse")
    public JAXBElement<AddProductResponse> createAddProductResponse(AddProductResponse value) {
        return new JAXBElement<>(_AddProductResponse_QNAME, AddProductResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteProduct }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteProduct }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.example.org/", name = "deleteProduct")
    public JAXBElement<DeleteProduct> createDeleteProduct(DeleteProduct value) {
        return new JAXBElement<>(_DeleteProduct_QNAME, DeleteProduct.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteProductResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteProductResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.example.org/", name = "deleteProductResponse")
    public JAXBElement<DeleteProductResponse> createDeleteProductResponse(DeleteProductResponse value) {
        return new JAXBElement<>(_DeleteProductResponse_QNAME, DeleteProductResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProduct }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetProduct }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.example.org/", name = "getProduct")
    public JAXBElement<GetProduct> createGetProduct(GetProduct value) {
        return new JAXBElement<>(_GetProduct_QNAME, GetProduct.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetProductResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.example.org/", name = "getProductResponse")
    public JAXBElement<GetProductResponse> createGetProductResponse(GetProductResponse value) {
        return new JAXBElement<>(_GetProductResponse_QNAME, GetProductResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Product }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Product }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.example.org/", name = "product")
    public JAXBElement<Product> createProduct(Product value) {
        return new JAXBElement<>(_Product_QNAME, Product.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductList }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ProductList }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.example.org/", name = "productList")
    public JAXBElement<ProductList> createProductList(ProductList value) {
        return new JAXBElement<>(_ProductList_QNAME, ProductList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductListResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ProductListResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.example.org/", name = "productListResponse")
    public JAXBElement<ProductListResponse> createProductListResponse(ProductListResponse value) {
        return new JAXBElement<>(_ProductListResponse_QNAME, ProductListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SellingPrice }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SellingPrice }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.example.org/", name = "sellingPrice")
    public JAXBElement<SellingPrice> createSellingPrice(SellingPrice value) {
        return new JAXBElement<>(_SellingPrice_QNAME, SellingPrice.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SellingPriceResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SellingPriceResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.example.org/", name = "sellingPriceResponse")
    public JAXBElement<SellingPriceResponse> createSellingPriceResponse(SellingPriceResponse value) {
        return new JAXBElement<>(_SellingPriceResponse_QNAME, SellingPriceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateProduct }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateProduct }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.example.org/", name = "updateProduct")
    public JAXBElement<UpdateProduct> createUpdateProduct(UpdateProduct value) {
        return new JAXBElement<>(_UpdateProduct_QNAME, UpdateProduct.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateProductResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateProductResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.example.org/", name = "updateProductResponse")
    public JAXBElement<UpdateProductResponse> createUpdateProductResponse(UpdateProductResponse value) {
        return new JAXBElement<>(_UpdateProductResponse_QNAME, UpdateProductResponse.class, null, value);
    }

}

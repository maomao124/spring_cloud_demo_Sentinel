package mao.order_service.entity;

import mao.feign.entity.User;

/**
 * Project name(项目名称)：spring_cloud_demo
 * Package(包名): mao.order_service.entity
 * Class(类名): Order
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/7/9
 * Time(创建时间)： 13:55
 * Version(版本): 1.0
 * Description(描述)： 实体类order
 */


public class Order
{
    private Long id;
    private Long price;
    private String name;
    private Integer num;
    private Long userId;
    private User user;

    /**
     * Instantiates a new Order.
     */
    public Order()
    {

    }

    /**
     * Instantiates a new Order.
     *
     * @param id     the id
     * @param price  the price
     * @param name   the name
     * @param num    the num
     * @param userId the user id
     * @param user   the user
     */
    public Order(Long id, Long price, String name, Integer num, Long userId, User user)
    {
        this.id = id;
        this.price = price;
        this.name = name;
        this.num = num;
        this.userId = userId;
        this.user = user;
    }

    /**
     * Gets id.
     *
     * @return the id
     */
    public Long getId()
    {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(Long id)
    {
        this.id = id;
    }

    /**
     * Gets price.
     *
     * @return the price
     */
    public Long getPrice()
    {
        return price;
    }

    /**
     * Sets price.
     *
     * @param price the price
     */
    public void setPrice(Long price)
    {
        this.price = price;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName()
    {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * Gets num.
     *
     * @return the num
     */
    public Integer getNum()
    {
        return num;
    }

    /**
     * Sets num.
     *
     * @param num the num
     */
    public void setNum(Integer num)
    {
        this.num = num;
    }

    /**
     * Gets user id.
     *
     * @return the user id
     */
    public Long getUserId()
    {
        return userId;
    }

    /**
     * Sets user id.
     *
     * @param userId the user id
     */
    public void setUserId(Long userId)
    {
        this.userId = userId;
    }

    /**
     * Gets user.
     *
     * @return the user
     */
    public User getUser()
    {
        return user;
    }

    /**
     * Sets user.
     *
     * @param user the user
     */
    public void setUser(User user)
    {
        this.user = user;
    }

    @Override
    @SuppressWarnings("all")
    public String toString()
    {
        final StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("id：").append(id).append('\n');
        stringbuilder.append("price：").append(price).append('\n');
        stringbuilder.append("name：").append(name).append('\n');
        stringbuilder.append("num：").append(num).append('\n');
        stringbuilder.append("userId：").append(userId).append('\n');
        stringbuilder.append("user：").append(user).append('\n');
        return stringbuilder.toString();
    }
}

<%@page import="DAO.ItemDAO"%>
<%@page import="DAO.CardapioSemDAO"%>
<%@page import="entidade.Item"%>
<%@page import="entidade.Cardapio"%>
<div class="cardapio-box">
    <%
        CardapioSemDAO daoCard = new CardapioSemDAO();
        ItemDAO daoItem = new ItemDAO();
        
        Cardapio[] cardapiosSeg = daoCard.getDiaCardapio("segunda");
        Cardapio[] cardapiosTer = daoCard.getDiaCardapio("terca");
        Cardapio[] cardapiosQuar = daoCard.getDiaCardapio("quarta");
        Cardapio[] cardapiosQuin = daoCard.getDiaCardapio("quinta");
        Cardapio[] cardapiosSex = daoCard.getDiaCardapio("sexta");
    %>
    <!-- inicio caroussel -->
    <a class="arrow-right nav-carousel" href="#carouselExampleControls" role="button" data-slide="next"><img src="img/arrow-right.png"></a>
    <a class="arrow-left nav-carousel" href="#carouselExampleControls" role="button" data-slide="prev"><img src="img/arrow-left.png"></a>
    <div class="clear"></div>

    <div id="carouselExampleControls" class="carousel carousel-cardapio slide" data-ride="">

        <div class="carousel-inner">
            <div class="carousel-item active">
                <div class="top-cardapio">
                    <h1>Segunda-feira</h1>
                </div>
                <div class="cardapio-content">
                    <table class="table table-cardapio">
                        <tbody>

                            <tr>
                                <th><h3>Almoço</h3></th>
                            </tr>
                            <tr>
                                <td><%= ((Item) (daoItem.getPojo(cardapiosSeg[0].getCarne1() + ""))).getNome()%></td>
                            </tr>
                            <tr>
                                <td><%= ((Item) (daoItem.getPojo(cardapiosSeg[0].getCarne2() + ""))).getNome()%></td>
                            </tr>
                            <tr>
                                <td><%= ((Item) (daoItem.getPojo(cardapiosSeg[0].getCarneVeg() + ""))).getNome()%></td>
                            </tr>
                            <tr>
                                <td><%= ((Item) (daoItem.getPojo(cardapiosSeg[0].getGuarn1() + ""))).getNome()%></td>
                            </tr>
                            <tr>
                                <td><%= ((Item) (daoItem.getPojo(cardapiosSeg[0].getGuarn2() + ""))).getNome()%></td>
                            </tr>
                            <tr>
                                <td><%= ((Item) (daoItem.getPojo(cardapiosSeg[0].getGuarn3() + ""))).getNome()%></td>
                            </tr>
                            <tr>
                                <td><%= ((Item) (daoItem.getPojo(cardapiosSeg[0].getSalada() + ""))).getNome()%></td>
                            </tr>
                            <tr>
                                <td><%= ((Item) (daoItem.getPojo(cardapiosSeg[0].getDoce() + ""))).getNome()%></td>
                            </tr>
                            <tr>
                                <td><%= ((Item) (daoItem.getPojo(cardapiosSeg[0].getSuco() + ""))).getNome()%></td>
                            </tr>
                            <tr>
                                <td><%= ((Item) (daoItem.getPojo(cardapiosSeg[0].getFruta() + ""))).getNome()%></td>
                            </tr>
                        </tbody>
                    </table>
                    <table class="table table-cardapio">
                        <tbody>


                            <tr>
                                <th><h3>Janta</h3></th>
                            </tr>
                            <tr>
                                <td><%= ((Item) (daoItem.getPojo(cardapiosSeg[1].getCarne1() + ""))).getNome()%></td>
                            </tr>
                            <tr>
                                <td><%= ((Item) (daoItem.getPojo(cardapiosSeg[1].getCarne2() + ""))).getNome()%></td>
                            </tr>
                            <tr>
                                <td><%= ((Item) (daoItem.getPojo(cardapiosSeg[1].getCarneVeg() + ""))).getNome()%></td>
                            </tr>
                            <tr>
                                <td><%= ((Item) (daoItem.getPojo(cardapiosSeg[1].getGuarn1() + ""))).getNome()%></td>
                            </tr>
                            <tr>
                                <td><%= ((Item) (daoItem.getPojo(cardapiosSeg[1].getGuarn2() + ""))).getNome()%></td>
                            </tr>
                            <tr>
                                <td><%= ((Item) (daoItem.getPojo(cardapiosSeg[1].getGuarn3() + ""))).getNome()%></td>
                            </tr>
                            <tr>
                                <td><%= ((Item) (daoItem.getPojo(cardapiosSeg[1].getSalada() + ""))).getNome()%></td>
                            </tr>
                            <tr>
                                <td><%= ((Item) (daoItem.getPojo(cardapiosSeg[1].getDoce() + ""))).getNome()%></td>
                            </tr>
                            <tr>
                                <td><%= ((Item) (daoItem.getPojo(cardapiosSeg[1].getSuco() + ""))).getNome()%></td>
                            </tr>
                            <tr>
                                <td><%= ((Item) (daoItem.getPojo(cardapiosSeg[1].getFruta() + ""))).getNome()%></td>
                            </tr>
                        </tbody>
                    </table>
                    <div class="clear"></div>
                </div>
            </div>
            <div class="carousel-item">
                <div class="top-cardapio">
                    <h1>Terça-feira</h1>
                </div>
                <div class="cardapio-content">
                    <table class="table table-cardapio">
                        <tbody>

                            <tr>
                                <th><h3>Almoço</h3></th>
                            </tr>
                            <tr>
                                <td><%= ((Item) (daoItem.getPojo(cardapiosTer[0].getCarne1() + ""))).getNome()%></td>
                            </tr>
                            <tr>
                                <td><%= ((Item) (daoItem.getPojo(cardapiosTer[0].getCarne2() + ""))).getNome()%></td>
                            </tr>
                            <tr>
                                <td><%= ((Item) (daoItem.getPojo(cardapiosTer[0].getCarneVeg() + ""))).getNome()%></td>
                            </tr>
                            <tr>
                                <td><%= ((Item) (daoItem.getPojo(cardapiosTer[0].getGuarn1() + ""))).getNome()%></td>
                            </tr>
                            <tr>
                                <td><%= ((Item) (daoItem.getPojo(cardapiosTer[0].getGuarn2() + ""))).getNome()%></td>
                            </tr>
                            <tr>
                                <td><%= ((Item) (daoItem.getPojo(cardapiosTer[0].getGuarn3() + ""))).getNome()%></td>
                            </tr>
                            <tr>
                                <td><%= ((Item) (daoItem.getPojo(cardapiosTer[0].getSalada() + ""))).getNome()%></td>
                            </tr>
                            <tr>
                                <td><%= ((Item) (daoItem.getPojo(cardapiosTer[0].getDoce() + ""))).getNome()%></td>
                            </tr>
                            <tr>
                                <td><%= ((Item) (daoItem.getPojo(cardapiosTer[0].getSuco() + ""))).getNome()%></td>
                            </tr>
                            <tr>
                                <td><%= ((Item) (daoItem.getPojo(cardapiosTer[0].getFruta() + ""))).getNome()%></td>
                            </tr>
                        </tbody>
                    </table>
                    <table class="table table-cardapio">
                        <tbody>


                            <tr>
                                <th><h3>Janta</h3></th>
                            </tr>
                            <tr>
                                <td><%= ((Item) (daoItem.getPojo(cardapiosTer[1].getCarne1() + ""))).getNome()%></td>
                            </tr>
                            <tr>
                                <td><%= ((Item) (daoItem.getPojo(cardapiosTer[1].getCarne2() + ""))).getNome()%></td>
                            </tr>
                            <tr>
                                <td><%= ((Item) (daoItem.getPojo(cardapiosTer[1].getCarneVeg() + ""))).getNome()%></td>
                            </tr>
                            <tr>
                                <td><%= ((Item) (daoItem.getPojo(cardapiosTer[1].getGuarn1() + ""))).getNome()%></td>
                            </tr>
                            <tr>
                                <td><%= ((Item) (daoItem.getPojo(cardapiosTer[1].getGuarn2() + ""))).getNome()%></td>
                            </tr>
                            <tr>
                                <td><%= ((Item) (daoItem.getPojo(cardapiosTer[1].getGuarn3() + ""))).getNome()%></td>
                            </tr>
                            <tr>
                                <td><%= ((Item) (daoItem.getPojo(cardapiosTer[1].getSalada() + ""))).getNome()%></td>
                            </tr>
                            <tr>
                                <td><%= ((Item) (daoItem.getPojo(cardapiosTer[1].getDoce() + ""))).getNome()%></td>
                            </tr>
                            <tr>
                                <td><%= ((Item) (daoItem.getPojo(cardapiosTer[1].getSuco() + ""))).getNome()%></td>
                            </tr>
                            <tr>
                                <td><%= ((Item) (daoItem.getPojo(cardapiosTer[1].getFruta() + ""))).getNome()%></td>
                            </tr>
                        </tbody>
                    </table>
                    <div class="clear"></div>
                </div>
            </div>
            <div class="carousel-item">
                <div class="top-cardapio">
                    <h1>Quarta-feira</h1>
                </div>
                <div class="cardapio-content">
                    <table class="table table-cardapio">
                        <tbody>

                            <tr>
                                <th><h3>Almoço</h3></th>
                            </tr>
                            <tr>
                                <td><%= ((Item) (daoItem.getPojo(cardapiosQuar[0].getCarne1() + ""))).getNome()%></td>
                            </tr>
                            <tr>
                                <td><%= ((Item) (daoItem.getPojo(cardapiosQuar[0].getCarne2() + ""))).getNome()%></td>
                            </tr>
                            <tr>
                                <td><%= ((Item) (daoItem.getPojo(cardapiosQuar[0].getCarneVeg() + ""))).getNome()%></td>
                            </tr>
                            <tr>
                                <td><%= ((Item) (daoItem.getPojo(cardapiosQuar[0].getGuarn1() + ""))).getNome()%></td>
                            </tr>
                            <tr>
                                <td><%= ((Item) (daoItem.getPojo(cardapiosQuar[0].getGuarn2() + ""))).getNome()%></td>
                            </tr>
                            <tr>
                                <td><%= ((Item) (daoItem.getPojo(cardapiosQuar[0].getGuarn3() + ""))).getNome()%></td>
                            </tr>
                            <tr>
                                <td><%= ((Item) (daoItem.getPojo(cardapiosQuar[0].getSalada() + ""))).getNome()%></td>
                            </tr>
                            <tr>
                                <td><%= ((Item) (daoItem.getPojo(cardapiosQuar[0].getDoce() + ""))).getNome()%></td>
                            </tr>
                            <tr>
                                <td><%= ((Item) (daoItem.getPojo(cardapiosQuar[0].getSuco() + ""))).getNome()%></td>
                            </tr>
                            <tr>
                                <td><%= ((Item) (daoItem.getPojo(cardapiosQuar[0].getFruta() + ""))).getNome()%></td>
                            </tr>
                        </tbody>
                    </table>
                    <table class="table table-cardapio">
                        <tbody>


                            <tr>
                                <th><h3>Janta</h3></th>
                            </tr>
                            <tr>
                                <td><%= ((Item) (daoItem.getPojo(cardapiosQuar[1].getCarne1() + ""))).getNome()%></td>
                            </tr>
                            <tr>
                                <td><%= ((Item) (daoItem.getPojo(cardapiosQuar[1].getCarne2() + ""))).getNome()%></td>
                            </tr>
                            <tr>
                                <td><%= ((Item) (daoItem.getPojo(cardapiosQuar[1].getCarneVeg() + ""))).getNome()%></td>
                            </tr>
                            <tr>
                                <td><%= ((Item) (daoItem.getPojo(cardapiosQuar[1].getGuarn1() + ""))).getNome()%></td>
                            </tr>
                            <tr>
                                <td><%= ((Item) (daoItem.getPojo(cardapiosQuar[1].getGuarn2() + ""))).getNome()%></td>
                            </tr>
                            <tr>
                                <td><%= ((Item) (daoItem.getPojo(cardapiosQuar[1].getGuarn3() + ""))).getNome()%></td>
                            </tr>
                            <tr>
                                <td><%= ((Item) (daoItem.getPojo(cardapiosQuar[1].getSalada() + ""))).getNome()%></td>
                            </tr>
                            <tr>
                                <td><%= ((Item) (daoItem.getPojo(cardapiosQuar[1].getDoce() + ""))).getNome()%></td>
                            </tr>
                            <tr>
                                <td><%= ((Item) (daoItem.getPojo(cardapiosQuar[1].getSuco() + ""))).getNome()%></td>
                            </tr>
                            <tr>
                                <td><%= ((Item) (daoItem.getPojo(cardapiosQuar[1].getFruta() + ""))).getNome()%></td>
                            </tr>
                        </tbody>
                    </table>
                    <div class="clear"></div>
                </div>
            </div>
            <div class="carousel-item">
                <div class="top-cardapio">
                    <h1>Quinta-feira</h1>
                </div>
                <div class="cardapio-content">
                    <table class="table table-cardapio">
                        <tbody>

                            <tr>
                                <th><h3>Almoço</h3></th>
                            </tr>
                            <tr>
                                <td><%= ((Item) (daoItem.getPojo(cardapiosQuin[0].getCarne1() + ""))).getNome()%></td>
                            </tr>
                            <tr>
                                <td><%= ((Item) (daoItem.getPojo(cardapiosQuin[0].getCarne2() + ""))).getNome()%></td>
                            </tr>
                            <tr>
                                <td><%= ((Item) (daoItem.getPojo(cardapiosQuin[0].getCarneVeg() + ""))).getNome()%></td>
                            </tr>
                            <tr>
                                <td><%= ((Item) (daoItem.getPojo(cardapiosQuin[0].getGuarn1() + ""))).getNome()%></td>
                            </tr>
                            <tr>
                                <td><%= ((Item) (daoItem.getPojo(cardapiosQuin[0].getGuarn2() + ""))).getNome()%></td>
                            </tr>
                            <tr>
                                <td><%= ((Item) (daoItem.getPojo(cardapiosQuin[0].getGuarn3() + ""))).getNome()%></td>
                            </tr>
                            <tr>
                                <td><%= ((Item) (daoItem.getPojo(cardapiosQuin[0].getSalada() + ""))).getNome()%></td>
                            </tr>
                            <tr>
                                <td><%= ((Item) (daoItem.getPojo(cardapiosQuin[0].getDoce() + ""))).getNome()%></td>
                            </tr>
                            <tr>
                                <td><%= ((Item) (daoItem.getPojo(cardapiosQuin[0].getSuco() + ""))).getNome()%></td>
                            </tr>
                            <tr>
                                <td><%= ((Item) (daoItem.getPojo(cardapiosQuin[0].getFruta() + ""))).getNome()%></td>
                            </tr>
                        </tbody>
                    </table>
                    <table class="table table-cardapio">
                        <tbody>


                            <tr>
                                <th><h3>Janta</h3></th>
                            </tr>
                            <tr>
                                <td><%= ((Item) (daoItem.getPojo(cardapiosQuin[1].getCarne1() + ""))).getNome()%></td>
                            </tr>
                            <tr>
                                <td><%= ((Item) (daoItem.getPojo(cardapiosQuin[1].getCarne2() + ""))).getNome()%></td>
                            </tr>
                            <tr>
                                <td><%= ((Item) (daoItem.getPojo(cardapiosQuin[1].getCarneVeg() + ""))).getNome()%></td>
                            </tr>
                            <tr>
                                <td><%= ((Item) (daoItem.getPojo(cardapiosQuin[1].getGuarn1() + ""))).getNome()%></td>
                            </tr>
                            <tr>
                                <td><%= ((Item) (daoItem.getPojo(cardapiosQuin[1].getGuarn2() + ""))).getNome()%></td>
                            </tr>
                            <tr>
                                <td><%= ((Item) (daoItem.getPojo(cardapiosQuin[1].getGuarn3() + ""))).getNome()%></td>
                            </tr>
                            <tr>
                                <td><%= ((Item) (daoItem.getPojo(cardapiosQuin[1].getSalada() + ""))).getNome()%></td>
                            </tr>
                            <tr>
                                <td><%= ((Item) (daoItem.getPojo(cardapiosQuin[1].getDoce() + ""))).getNome()%></td>
                            </tr>
                            <tr>
                                <td><%= ((Item) (daoItem.getPojo(cardapiosQuin[1].getSuco() + ""))).getNome()%></td>
                            </tr>
                            <tr>
                                <td><%= ((Item) (daoItem.getPojo(cardapiosQuin[1].getFruta() + ""))).getNome()%></td>
                            </tr>
                        </tbody>
                    </table>
                    <div class="clear"></div>
                </div>
            </div>
            <div class="carousel-item">
                <div class="top-cardapio">
                    <h1>Sexta-feira</h1>
                </div>
                <div class="cardapio-content">
                    <table class="table table-cardapio">
                        <tbody>

                            <tr>
                                <th><h3>Almoço</h3></th>
                            </tr>
                            <tr>
                                <td><%= ((Item) (daoItem.getPojo(cardapiosSex[0].getCarne1() + ""))).getNome()%></td>
                            </tr>
                            <tr>
                                <td><%= ((Item) (daoItem.getPojo(cardapiosSex[0].getCarne2() + ""))).getNome()%></td>
                            </tr>
                            <tr>
                                <td><%= ((Item) (daoItem.getPojo(cardapiosSex[0].getCarneVeg() + ""))).getNome()%></td>
                            </tr>
                            <tr>
                                <td><%= ((Item) (daoItem.getPojo(cardapiosSex[0].getGuarn1() + ""))).getNome()%></td>
                            </tr>
                            <tr>
                                <td><%= ((Item) (daoItem.getPojo(cardapiosSex[0].getGuarn2() + ""))).getNome()%></td>
                            </tr>
                            <tr>
                                <td><%= ((Item) (daoItem.getPojo(cardapiosSex[0].getGuarn3() + ""))).getNome()%></td>
                            </tr>
                            <tr>
                                <td><%= ((Item) (daoItem.getPojo(cardapiosSex[0].getSalada() + ""))).getNome()%></td>
                            </tr>
                            <tr>
                                <td><%= ((Item) (daoItem.getPojo(cardapiosSex[0].getDoce() + ""))).getNome()%></td>
                            </tr>
                            <tr>
                                <td><%= ((Item) (daoItem.getPojo(cardapiosSex[0].getSuco() + ""))).getNome()%></td>
                            </tr>
                            <tr>
                                <td><%= ((Item) (daoItem.getPojo(cardapiosSex[0].getFruta() + ""))).getNome()%></td>
                            </tr>
                        </tbody>
                    </table>
                    <table class="table table-cardapio">
                        <tbody>


                            <tr>
                                <th><h3>Janta</h3></th>
                            </tr>
                            <tr>
                                <td><%= ((Item) (daoItem.getPojo(cardapiosSex[1].getCarne1() + ""))).getNome()%></td>
                            </tr>
                            <tr>
                                <td><%= ((Item) (daoItem.getPojo(cardapiosSex[1].getCarne2() + ""))).getNome()%></td>
                            </tr>
                            <tr>
                                <td><%= ((Item) (daoItem.getPojo(cardapiosSex[1].getCarneVeg() + ""))).getNome()%></td>
                            </tr>
                            <tr>
                                <td><%= ((Item) (daoItem.getPojo(cardapiosSex[1].getGuarn1() + ""))).getNome()%></td>
                            </tr>
                            <tr>
                                <td><%= ((Item) (daoItem.getPojo(cardapiosSex[1].getGuarn2() + ""))).getNome()%></td>
                            </tr>
                            <tr>
                                <td><%= ((Item) (daoItem.getPojo(cardapiosSex[1].getGuarn3() + ""))).getNome()%></td>
                            </tr>
                            <tr>
                                <td><%= ((Item) (daoItem.getPojo(cardapiosSex[1].getSalada() + ""))).getNome()%></td>
                            </tr>
                            <tr>
                                <td><%= ((Item) (daoItem.getPojo(cardapiosSex[1].getDoce() + ""))).getNome()%></td>
                            </tr>
                            <tr>
                                <td><%= ((Item) (daoItem.getPojo(cardapiosSex[1].getSuco() + ""))).getNome()%></td>
                            </tr>
                            <tr>
                                <td><%= ((Item) (daoItem.getPojo(cardapiosSex[1].getFruta() + ""))).getNome()%></td>
                            </tr>
                        </tbody>
                    </table>
                    <div class="clear"></div>
                </div>
            </div>             
        </div>
    </div>

    <!-- fim caroussel -->

</div>